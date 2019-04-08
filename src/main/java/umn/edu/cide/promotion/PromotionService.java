package umn.edu.cide.promotion;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;
import umn.edu.cide.promotion.umn.edu.cide.promotion.pojo.Promotion;
import umn.edu.cide.promotion.umn.edu.cide.promotion.repository.PromotionRepository;

import java.util.Date;
import java.util.UUID;

@SpringBootApplication
public class PromotionService {
	public static void main(String[] args) {
		SpringApplication.run(PromotionService.class, args);
	}

	@Bean
	ApplicationRunner init(PromotionRepository repository){
		Object[][] data = {
				{"123", "bogo", new Date(), "harry1", UUID.randomUUID(), true},
				{"234", "free shipping", new Date(), "harry2", UUID.randomUUID(), true},
				{"567", "10 dollar off", new Date(), "harry3", UUID.randomUUID(), false}
		};
		return args -> {
			repository
					.deleteAll()
					.thenMany(
							Flux
									.just(data)
									.map(array -> {
										return new Promotion((String) array[0], (String) array[1], (Date) array[2], (String) array[3], (UUID) array[4], (boolean)array[5]);
									})
									.flatMap(repository::save)
					)
					.thenMany(repository.findAll())
					.subscribe(promotion -> System.out.println("saving " + promotion.toString()));
		};
	}
}

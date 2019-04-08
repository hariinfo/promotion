package umn.edu.cide.promotion.umn.edu.cide.promotion.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;
import umn.edu.cide.promotion.umn.edu.cide.promotion.pojo.Promotion;

public interface PromotionRepository extends ReactiveMongoRepository<Promotion, String> {
    //Mono<Promotion> findByName(String name);

}

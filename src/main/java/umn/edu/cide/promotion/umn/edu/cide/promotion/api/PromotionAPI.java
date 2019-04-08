package umn.edu.cide.promotion.umn.edu.cide.promotion.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import umn.edu.cide.promotion.umn.edu.cide.promotion.pojo.Promotion;
import umn.edu.cide.promotion.umn.edu.cide.promotion.repository.PromotionRepository;

@RestController
@RequestMapping("/v1/promotion")
    public class PromotionAPI {

    @Autowired
    private PromotionRepository promotionRepository;

    @PostMapping
    public @ResponseBody
    Mono<Promotion> addPromotion(@RequestBody Promotion promotion){
        return promotionRepository.save(promotion);
    }

    @GetMapping
    public @ResponseBody
    Flux<Promotion> getAllPromotions(){
        return promotionRepository.findAll();
    }

}

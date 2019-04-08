package umn.edu.cide.promotion.umn.edu.cide.promotion.pojo;

import umn.edu.cide.promotion.umn.edu.cide.promotion.domain.PromotionType;

public class AbstractPromotion {
    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
    }

    private PromotionType promotionType;

}

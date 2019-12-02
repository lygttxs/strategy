package strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 李宇刚 on 2019-11-23
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> promotionStrategy_Map = new HashMap<>();
    static {
        promotionStrategy_Map.put(PromotionKey.FANXIAN, new FanXianPromotionStrategy());
        promotionStrategy_Map.put(PromotionKey.LIJIAN, new LiJianPromotionStrategy());
        promotionStrategy_Map.put(PromotionKey.MANJIAN, new ManJianPromotionStrategy());
    }

    private PromotionStrategyFactory(){}

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = promotionStrategy_Map.get(promotionKey);
        if (promotionStrategy == null)
            return null;
        else
            return promotionStrategy;
    }

    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String FANXIAN = "FANXIAN";
        String MANJIAN = "MANJIAN";
    }

}

package org.tweeted.designpatterns.strategy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author guan.yuhui
 * @Date 2021/12/3
 */
public class StrategyFactory {
    private static Map<PayType, IPayStrategy> strategyMap = new ConcurrentHashMap<>();

    private StrategyFactory() {
    }

    public static void initStrategy(PayType enumPayType, IPayStrategy strategy) {
        strategyMap.put(enumPayType, strategy);
    }

    private static class InstanceHolder {
        public static StrategyFactory INSTANCE = new StrategyFactory();
    }

    public static StrategyFactory getInstance() {
        return InstanceHolder.INSTANCE;
    }

    public IPayStrategy creator(PayType type) {
        return strategyMap.get(type);
    }
}

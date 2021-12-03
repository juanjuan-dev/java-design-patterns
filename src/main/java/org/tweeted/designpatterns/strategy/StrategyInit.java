package org.tweeted.designpatterns.strategy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 策略初始化
 *
 * @author Jianlo
 */
@Order(1)
@Component
public class StrategyInit implements ApplicationRunner {

    @Resource
    private Map<String, IPayStrategy> payStrategy;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        initPayStrategy();
    }

    private void initPayStrategy() {
        Set<String> strategyKeys = payStrategy.keySet();
        for (String strategyKey : strategyKeys) {
            List<PayType> enumPayTypes = PayType.keyContainOf(strategyKey);
            if (enumPayTypes.isEmpty()) {
                System.out.println("Strategy init failure : " + strategyKey);
            }
            IPayStrategy strategy = payStrategy.get(strategyKey);
            for (PayType enumPayType : enumPayTypes) {
                StrategyFactory.initStrategy(enumPayType, strategy);
            }
        }
    }
}
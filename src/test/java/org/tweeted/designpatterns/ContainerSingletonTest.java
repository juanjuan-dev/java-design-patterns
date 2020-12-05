package org.tweeted.designpatterns;

import org.tweeted.designpatterns.singleton.register.ContainerSingleton;

/**
 * @author tweeted
 * @date 2020/11/29 16:14
 */
public class ContainerSingletonTest {
    public static void main(String[] args) {

        try {
            ConcurrentExecutor.execute(() -> {
                Object object = ContainerSingleton.getBean("org.tweeted.designpatterns.Pojo");
                System.out.println(System.currentTimeMillis() + ":" + object);
            }, 10, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

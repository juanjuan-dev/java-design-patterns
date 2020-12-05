package org.tweeted.designpatterns.singleton.hungry;

/**
 * 饿汉式单例模式
 *
 * @author tweeted
 * @date 2020/11/29 14:39
 */
public class HungryStaticSingleton {
    private static final HungryStaticSingleton HUNGRY_STATIC_SINGLETON;

    static {
        HUNGRY_STATIC_SINGLETON = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance() {
        return HUNGRY_STATIC_SINGLETON;
    }

    private HungryStaticSingleton() {
    }

}

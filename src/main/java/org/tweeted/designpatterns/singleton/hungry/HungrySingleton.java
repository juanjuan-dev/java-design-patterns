package org.tweeted.designpatterns.singleton.hungry;

/**
 * 饿汉式单例模式
 *
 * @author tweeted
 * @date 2020/11/29 14:37
 */
public class HungrySingleton {
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }

    private HungrySingleton() {
    }

}

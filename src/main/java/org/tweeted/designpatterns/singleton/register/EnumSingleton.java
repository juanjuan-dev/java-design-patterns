package org.tweeted.designpatterns.singleton.register;

/**
 * 枚举式单例模式 推荐使用
 *
 * @author tweeted
 * @date 2020/11/29 15:54
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}

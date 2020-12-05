package org.tweeted.designpatterns.singleton.lazy;

/**
 * 性能最优的一种单例写法
 *
 * @author tweeted
 * @date 2020/11/29 15:16
 */
public class LazyInnerClassSingleton {

    //虽然构造方法私有了，但是跳不过反射的法眼
    private LazyInnerClassSingleton() {
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("not create");
        }
    }

    /**
     * 懒汉式单例
     * LazyHolder 里面的逻辑需要等到外部方法调用时才执行
     * 巧妙利用了内部类的特性
     * JVM底层执行逻辑，完美地避免了线程安全问题
     */
    public static final LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }
}

package org.tweeted.designpatterns.singleton.lazy;

/**
 * 懒汉式单列 线程不安全
 *
 * @author tweeted
 * @date 2020/11/29 14:44
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton lazy = null;

    private LazySimpleSingleton() {
    }

//    public static LazySimpleSingleton getInstance() {
//        if (lazy == null) {
//            //线程不安全指如果两个线程同时执行两次会创建两次，后一个会覆盖前一次
//            lazy = new LazySimpleSingleton();
//        }
//        return lazy;
//    }

    /**
     * 线程安全的写法
     * JDK 1.6对synchronized性能优化了不少
     * 但是不可避免的还是存在一定的性能问题
     */
    public static synchronized LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}

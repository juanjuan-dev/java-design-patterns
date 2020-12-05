package org.tweeted.designpatterns.singleton.lazy;

/**
 * @author tweeted
 * @date 2020/11/29 15:02
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazy = null;

    private LazyDoubleCheckSingleton() {
    }

    /**
     * 线程安全的写法
     * 适中的方案
     * 双重检查锁
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                    /*
                    CPU执行时候会转化成JVM指令执行
                    指令重排序问题， volatile解决
                    1、分配内存给这个对象
                    2、初始化对象
                    3、将初始化好的对象和内存地址建立关联，赋值
                    4、用户初次访问
                     */
                }
            }
        }
        return lazy;
    }
}

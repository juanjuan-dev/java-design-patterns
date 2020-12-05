package org.tweeted.designpatterns.singleton.threadlocal;

/**
 * @author tweeted
 * @date 2020/11/29 16:24
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            ThreadLocal.withInitial(ThreadLocalSingleton::new);

    
    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}

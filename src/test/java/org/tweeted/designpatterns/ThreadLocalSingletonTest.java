package org.tweeted.designpatterns;

import org.tweeted.designpatterns.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author tweeted
 * @date 2020/11/29 16:27
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {

        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());
        System.out.println(ThreadLocalSingleton.getInstance());

        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();
        System.out.println("END");
    }
}

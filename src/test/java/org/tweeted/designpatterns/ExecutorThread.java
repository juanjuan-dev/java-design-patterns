package org.tweeted.designpatterns;

import org.tweeted.designpatterns.singleton.lazy.LazyDoubleCheckSingleton;
import org.tweeted.designpatterns.singleton.lazy.LazySimpleSingleton;
import org.tweeted.designpatterns.singleton.threadlocal.ThreadLocalSingleton;

/**
 * @author tweeted
 * @date 2020/11/29 14:48
 */
public class ExecutorThread implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
//        LazySimpleSingleton simpleSingleton = LazySimpleSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);

//        LazyDoubleCheckSingleton simpleSingleton = LazyDoubleCheckSingleton.getInstance();
//        System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);

        ThreadLocalSingleton simpleSingleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + simpleSingleton);


    }
}

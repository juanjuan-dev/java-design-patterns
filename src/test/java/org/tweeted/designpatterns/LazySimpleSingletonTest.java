package org.tweeted.designpatterns;

/**
 * @author tweeted
 * @date 2020/11/29 14:47
 */
public class LazySimpleSingletonTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());

        t1.start();
        t2.start();

        System.out.println(" Executor end");
    }
}

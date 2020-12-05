package org.tweeted.designpatterns;

import org.tweeted.designpatterns.singleton.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

/**
 * @author tweeted
 * @date 2020/11/29 15:25
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        Class<LazyInnerClassSingleton> lazyInnerClassSingletonClass = LazyInnerClassSingleton.class;
        try {

            Constructor<LazyInnerClassSingleton> declaredConstructor = lazyInnerClassSingletonClass.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object o1 = declaredConstructor.newInstance();


            Object o2 = LazyInnerClassSingleton.getInstance();

            System.out.println(o1 == o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

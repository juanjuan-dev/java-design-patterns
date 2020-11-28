package org.tweeted.designpatterns.factory.simplefactory;

/**
 * @author tweeted
 * @date 2020/11/28 12:35
 */
public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("Python");
    }
}

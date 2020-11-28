package org.tweeted.designpatterns.factory.simplefactory;

/**
 * @author tweeted
 * @date 2020/11/28 12:12
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("JAVA 课程");
    }
}

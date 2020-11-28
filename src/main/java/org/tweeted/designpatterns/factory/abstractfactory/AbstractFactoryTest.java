package org.tweeted.designpatterns.factory.abstractfactory;

/**
 * @author tweeted
 * @date 2020/11/28 15:02
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote();
        factory.createVideo();
    }
}

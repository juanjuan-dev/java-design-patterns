package org.tweeted.designpatterns.factory.simplefactory;

import org.slf4j.LoggerFactory;

import java.util.Calendar;

/**
 * 简单工厂模式-逻辑简单-创建数量少
 * Calendar.getInstance
 *
 * @author tweeted
 * @date 2020/11/28 12:13
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
//        ICourse course = new JavaCourse();
//        course.record();

        CourseFactory courseFactory = new CourseFactory();
//        try {
//            courseFactory.create("org.tweeted.designpatterns.factory.simplefactory.JavaCourse");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
        //工厂类只关心传入工厂的参数对于创建对象的逻辑不需要关心
        ICourse javaCourse = courseFactory.create(JavaCourse.class);
        ICourse pythonCourse = courseFactory.create(PythonCourse.class);
        // jdk 简单工厂
        Calendar.getInstance();
        LoggerFactory.getLogger(SimpleFactoryTest.class);
    }
}

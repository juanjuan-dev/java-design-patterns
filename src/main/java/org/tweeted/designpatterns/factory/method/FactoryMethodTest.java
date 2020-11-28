package org.tweeted.designpatterns.factory.method;

import org.slf4j.LoggerFactory;
import org.tweeted.designpatterns.factory.ICourse;

/**
 * 方法工厂模式
 *
 * @author tweeted
 * @date 2020/11/28 12:58
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse pythonFactory = factory.create();
        pythonFactory.record();

        // 对方法工厂模式的使用
//        ILoggerFactory.getLogger()
    }
}

package org.tweeted.designpatterns.factory.method;

import org.tweeted.designpatterns.factory.ICourse;
import org.tweeted.designpatterns.factory.simple.PythonCourse;

/**
 * @author tweeted
 * @date 2020/11/28 13:00
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}

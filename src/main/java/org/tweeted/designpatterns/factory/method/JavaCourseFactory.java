package org.tweeted.designpatterns.factory.method;

import org.tweeted.designpatterns.factory.ICourse;
import org.tweeted.designpatterns.factory.JavaCourse;

/**
 * @author tweeted
 * @date 2020/11/28 12:59
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}

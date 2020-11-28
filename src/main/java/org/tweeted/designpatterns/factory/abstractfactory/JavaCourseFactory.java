package org.tweeted.designpatterns.factory.abstractfactory;

import org.tweeted.designpatterns.factory.*;

/**
 * @author tweeted
 * @date 2020/11/28 14:59
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }

    @Override
    public ISource createSource() {
        return null;
    }
}

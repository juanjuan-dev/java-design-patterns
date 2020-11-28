package org.tweeted.designpatterns.factory.abstractfactory;

import org.tweeted.designpatterns.factory.ICourse;
import org.tweeted.designpatterns.factory.INote;
import org.tweeted.designpatterns.factory.IVideo;
import org.tweeted.designpatterns.factory.PythonNote;
import org.tweeted.designpatterns.factory.simple.PythonCourse;

/**
 * @author tweeted
 * @date 2020/11/28 15:09
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return null;
    }

    @Override
    public ISource createSource() {
        return null;
    }

}

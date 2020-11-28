package org.tweeted.designpatterns.factory.simplefactory;

/**
 * @author tweeted
 * @date 2020/11/28 12:14
 */
public class CourseFactory {

//    public ICourse create(String courseName) {
//        if ("java".equals(courseName)) {
//            return new JavaCourse();
//        } else {
//            return null;
//        }
//    }

    //    public ICourse create(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
//        if (className == null || "".equals(className)) {
//            return null;
//        }
//
//        return (ICourse) Class.forName(className).newInstance();
//    }
    public ICourse create(Class objectClass) {
        if (objectClass == null) {
            return null;
        }


        ICourse course = null;
        try {
            course = (ICourse) objectClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return course;

    }
}

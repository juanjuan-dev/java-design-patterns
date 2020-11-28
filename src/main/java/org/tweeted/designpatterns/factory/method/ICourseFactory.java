package org.tweeted.designpatterns.factory.method;

import org.tweeted.designpatterns.factory.ICourse;

/**
 * 工厂方法模式让类的实例化推迟到子类中进行
 *
 * @author tweeted
 * @date 2020/11/28 12:58
 */
public interface ICourseFactory {
    ICourse create();
}

package org.tweeted.designpatterns.factory.abstractfactory;

import org.tweeted.designpatterns.factory.ICourse;
import org.tweeted.designpatterns.factory.INote;
import org.tweeted.designpatterns.factory.IVideo;

/**
 * 要求所有的子工厂都实现这个工厂
 * 一个品牌的抽象
 * 抽象工厂不符合开闭原则 拓展性非常强
 * 修改。
 * spring 里面使用抽象工厂模式 AbstractBeanFactory
 *
 * @author tweeted
 * @date 2020/11/28 14:57
 */
public interface ICourseFactory {
    ICourse createCourse();

    INote createNote();

    IVideo createVideo();

    ISource createSource();
}

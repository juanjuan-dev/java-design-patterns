package org.tweeted.designpatterns.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author tweeted
 * @date 2020/11/29 16:09
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    /**
     * 对象方便管理，其实也是属于懒加载
     * 存在线程安全问题
     */
    public static Object getBean(String className) {

        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object object = null;

                try {
                    object = Class.forName(className).newInstance();
                    ioc.put(className, object);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return object;
            }
            return ioc.get(className);
        }

    }
}

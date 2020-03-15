package com.pattern.creation.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例-容器缓存式单例【IOC中的单例模式即容器缓存式单例】
 * 注册式单例：将每一个实例都注册到固定的容器，使用唯一的标识获取实例
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/4 0:32
 */
public class RegisterContainer {

    /**
     * 私有化构造器
     */
    private RegisterContainer() {}

    /**
     * 单例注册表【并发线程安全Map容器】
     */
    private static Map<String, Object> container = new ConcurrentHashMap<>();

    /**
     * 全局访问点
     *
     * @param className 类的全限定名
     * @return RegisterContainer单例对象
     */
    public static Object getBean(String className) {
        // 如果不加同步锁，会导致线程安全问题，获取到多例对象
        synchronized (container) {
            if (container.containsKey(className)) {
                return container.get(className);
            } else {
                try {
                    container.put(className, Class.forName(className).newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return container.get(className);
            }
        }
    }

}

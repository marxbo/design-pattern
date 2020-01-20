package com.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例-容器缓存式单例【IOC中的单例模式即注册式单例】
 * 注册式单例：将每一个实例都注册到固定的容器，使用唯一的标识获取实例
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/4 0:32
 */
public class RegisterMap {

    /**
     * 私有化构造器
     */
    private RegisterMap() {}

    /**
     * 单例注册表【并发线程安全Map容器】
     */
    private static Map<String, Object> register = new ConcurrentHashMap<>();

    /**
     * 全局访问点
     *
     * @param name 类的全限定名
     * @return 单例对象
     */
    public static RegisterMap getInstance(String name) {
        if (name == null) {
            name = RegisterMap.class.getName();
        }

        if (register.get(name) == null) {
            try {
                register.put(name, Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return (RegisterMap) register.get(name);
    }

}

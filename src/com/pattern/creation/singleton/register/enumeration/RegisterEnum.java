package com.pattern.creation.singleton.register.enumeration;

/**
 * 注册式单例-枚举式单例【线程安全、避免反射和反序列化侵入破坏单例】
 * 注册式单例：将每一个实例都注册到固定的容器，使用唯一的标识获取实例
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/14 23:53
 */
public enum RegisterEnum {

    /** 单例 */
    INSTANCE;

    private Object data;

    public static RegisterEnum getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

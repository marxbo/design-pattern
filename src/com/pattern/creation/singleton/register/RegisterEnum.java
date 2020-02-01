package com.pattern.creation.singleton.register;

/**
 * 注册式单例-枚举式单例【线程安全、避免反射和反序列化侵入破坏单例】
 * 注册式单例：将每一个实例都注册到固定的容器，使用唯一的标识获取实例
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/4 1:01
 */
public enum RegisterEnum {

    /**
     * 枚举对象是天然线程安全的单例
     */
    SINGLETON_ONE("a", "b"),
    SINGLETON_TWO("A", "B");

    /** a属性 */
    private String a;
    /** b属性 */
    private String b;

    /**
     * 有参构造器
     *
     * @param a a属性
     * @param b b属性
     */
    private RegisterEnum(String a, String b) {
        this.a = a;
        this.b = b;
    }

}

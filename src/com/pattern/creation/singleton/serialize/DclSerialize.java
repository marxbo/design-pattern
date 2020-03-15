package com.pattern.creation.singleton.serialize;

import java.io.Serializable;

/**
 * 双重检测锁式单例(DCL,Double Check Lock)-线程安全的懒汉式单例【线程安全、但序列化可以破坏单例】
 *
 * 注：DCL是单例模式的性能最优写法
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/12 22:38
 */
public class DclSerialize implements Serializable {

    /**
     * 静态变量
     * volatile：保证变量的可见性
     */
    private volatile static DclSerialize instance = null;

    /**
     * 私有化构造器
     */
    private DclSerialize() {}

    /**
     * 全局访问点
     *
     * @return 单例对象
     */
    public static DclSerialize getInstance() {
        /**
         * 为什么最外层if判空明明却可以去掉还要加？
         * 答：初始化单例后不再触发加锁操作。多线程并发执行时都会加锁，消耗性能。
         */
        if (instance == null) {
            synchronized (DclSerialize.class) {
                if (instance == null) {
                    instance = new DclSerialize();
                }
            }
        }
        return instance;
    }

    /**
     * 问：为什么在单例类定义readResolve()方法可以防止序列化破坏单例？
     * 答：在objectInputStream.readObject()的调用栈readOrdinaryObject方法中：
     *         Object rep = desc.invokeReadResolve(obj);
     *     通过反射调用被反序列化的类的readResolve()方法
     */

    /**
     * 问：如何防止序列化破坏单例？
     * 答：定义readResolve()方法
     *
     * @return 单例对象
     */
//    private Object readResolve() {
//        return instance;
//    }

}

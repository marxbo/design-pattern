package com.pattern.creation.singleton.threadlocal;

/**
 * ThreadLocal单例【同个线程中保证单例，天然线程安全，以空间换时间】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/15 23:07
 */
public class ThreadLocalSingleton {

    /**
     * 私有化构造器
     */
    private ThreadLocalSingleton() {}

    /**
     * (1)如果ThreadLocal对象没有调用过set()，第一次调用get()时会进行初始化initialValue()，每个线程会调用一次initialValue()。
     * (2)ThreadLocal将所有对象放在ThreadLocalMap中，为每个线程都提供一个对象，实际上是以空间换时间来实现线程间隔离的。
     */
    private static final ThreadLocal<ThreadLocalSingleton> INSTANCE = new ThreadLocal<ThreadLocalSingleton>() {
        // 重写ThreadLocal的initialValue()方法
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    /**
     * 全局访问点
     *
     * @return
     */
    public static ThreadLocalSingleton getInstance() {
        return INSTANCE.get();
    }

}

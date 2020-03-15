package com.pattern.creation.singleton.lazy.two;

/**
 * 懒汉单例模式-加同步锁【用性能换取线程安全】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:16
 */
public class LazyTwo {

    /**
     * 私有化构造器
     */
    private LazyTwo() {}

    /**
     * 静态变量（注意：对象不是final常量）
     */
    private static LazyTwo lazy = null;

    /**
     * 全局访问点-直接加同步锁
     *
     * IDEA多线程模式Debug时，当第一个线程【RUNNING状态】正在执行getInstance()同步方法，
     * 第二个线程也进入该方法，出现阻塞【RUNNING变成MONITOR状态】，直到第一个线程执行完同步方法，
     * 第二个线程【MONITOR变成RUNNING状态】才能继续执行。
     *
     * @return LazyTwo
     */
    public static synchronized LazyTwo getInstance() {
        if (lazy == null) {
            lazy = new LazyTwo();
        }
        return lazy;
    }

}

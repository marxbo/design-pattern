package com.pattern.singleton.lazy;

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
     * 全局访问点
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

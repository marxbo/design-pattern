package com.pattern.singleton.lazy;

/**
 * 懒汉单例模式-延迟加载【线程不安全，以时间换空间】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:16
 */
public class LazyOne {

    /**
     * 私有化构造器
     */
    private LazyOne() {}

    /**
     * 静态变量（注意：对象不是final常量）
     */
    private static LazyOne lazy = null;


    /**
     * 全局访问点
     * 线程不安全分析：假设两个线程并发获取单例。线程一刚判断instance完是否为null，JVM将CPU资源切换给线程二，
     *               线程二执行了new操作。片刻之后，线程一被重新唤醒，又执行了new操作，因此出现了多例对象。
     * @return LazyOne
     */
    public static LazyOne getInstance() {
        if (lazy == null) {
            lazy = new LazyOne();
        }
        return lazy;
    }

}

package com.pattern.creation.singleton.lazy.three.safe;

/**
 * 懒汉单例模式-静态内部类【延迟加载、线程安全且防止反射侵入破坏单例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/3 23:05
 */
public class LazyThreeSafe {

    /** 是否已经初始化 */
    private static boolean initialized = false;

    /**
     * 私有化构造器
     */
    private LazyThreeSafe() {
        synchronized (LazyThreeSafe.class) {
            if (!initialized) {
                initialized = !initialized;
            } else {
                throw new RuntimeException("单例对象不允许创建多个实例！");
            }
        }
    }

    /**
     * 静态内部类
     */
    private static class StaticInnerLazy {
        private static final LazyThreeSafe LAZY_THREE = new LazyThreeSafe();
    }

    /**
     * 全局访问点
     *
     * @return LazyThree
     */
    public static final LazyThreeSafe getInstance() {
        return StaticInnerLazy.LAZY_THREE;
    }

}

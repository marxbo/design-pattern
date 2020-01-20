package com.pattern.singleton.lazy;

/**
 * 懒汉单例模式-静态内部类【线程安全、但存在反射侵入破坏单例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/3 23:05
 */
public class LazyThree {

    /*
        加载一个类时，其内部类不会同时被加载。（延迟加载，不占内存）
        一个类被加载，当且仅当其某个静态成员（静态域、构造器、静态方法等）被调用时发生。
     */

    /**
     * 私有化构造器
     */
    private LazyThree() {}

    /**
     * 静态内部类
     */
    private static class StaticInnerLazy {
        // 静态常量：保证唯一
        private static final LazyThree LAZY_THREE = new LazyThree();
    }

    /**
     * 全局访问点
     *
     * @return LazyThree
     */
    public static LazyThree getInstance() {
        return StaticInnerLazy.LAZY_THREE;
    }

}

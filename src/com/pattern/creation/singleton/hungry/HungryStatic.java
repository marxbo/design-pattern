package com.pattern.creation.singleton.hungry;

/**
 * 饿汉单例模式(静态代码块写法)-立即加载【线程安全，但以空间换时间，占内存】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:16
 */
public class HungryStatic {

    /**
     * 私有化构造器
     */
    private HungryStatic() {}

    /**
     * 静态常量
     */
    private static final HungryStatic HUNGRY;

    /**
     * 静态代码块
     */
    static {
        HUNGRY = new HungryStatic();
    }

    /**
     * 全局访问点
     *
     * @return Hungry
     */
    public static HungryStatic getInstance() {
        return HUNGRY;
    }

}

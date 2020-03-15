package com.pattern.creation.singleton.hungry;

/**
 * 饿汉单例模式-立即加载【线程安全，但以空间换时间，占内存】
 *
 * 单例模式
 * -作用：
 *      确保任何情况下都绝对只有一个实例。
 * -应用：
 *      ServletContext、ServletConfig、ApplicationContext、DBPool
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:16
 */
public class Hungry {

    /**
     * 私有化构造器
     */
    private Hungry() {}

    /**
     * 静态常量
     */
    private static final Hungry HUNGRY = new Hungry();

    /**
     * 全局访问点
     *
     * @return Hungry
     */
    public static Hungry getInstance() {
        return HUNGRY;
    }

}

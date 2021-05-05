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
     * new一个对象的执行顺序：
     * ①静态代码块/静态变量(按代码顺序) ②初始化成员变量 ③构造代码块执行 ④构造方法
     * 注意：如果之前已经加载过类了，静态代码块就不执行了。
     */

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

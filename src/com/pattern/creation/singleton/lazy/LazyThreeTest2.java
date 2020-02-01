package com.pattern.creation.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉单例模式测试-静态内部类【反射侵入破坏单例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:20
 */
public class LazyThreeTest2 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取无参构造器
        Constructor<LazyThree> con = LazyThree.class.getDeclaredConstructor();
        // 取消java访问检查，破坏私有构造器
        con.setAccessible(true);
        // 创建2个静态内部类式懒汉单例类对象
        LazyThree lazyThree1 = con.newInstance();
        LazyThree lazyThree2 = con.newInstance();

        // 非单例对象
        System.out.println(lazyThree1);
        System.out.println(lazyThree2);
        System.out.println(lazyThree1.equals(lazyThree2));
    }

}

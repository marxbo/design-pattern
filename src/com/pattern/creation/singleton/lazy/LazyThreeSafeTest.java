package com.pattern.creation.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉单例模式测试-静态内部类【防止反射侵入破坏单例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:20
 */
public class LazyThreeSafeTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取无参构造器
        Constructor<LazyThreeSafe> con = LazyThreeSafe.class.getDeclaredConstructor();
        // 取消java访问检查，破坏私有构造器
        con.setAccessible(true);
        // 创建2个静态内部类式懒汉单例类对象
        LazyThreeSafe lazyThreeSafe1 = con.newInstance();
        LazyThreeSafe lazyThreeSafe2 = con.newInstance();

        // 非单例对象
        System.out.println(lazyThreeSafe1);
        System.out.println(lazyThreeSafe2);
        System.out.println(lazyThreeSafe1.equals(lazyThreeSafe2));
    }

}

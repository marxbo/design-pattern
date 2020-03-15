package com.pattern.creation.singleton.register;

import java.lang.reflect.Constructor;

/**
 * 注册式单例反射测试-枚举式单例【线程安全、避免反射和反序列化侵入破坏单例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/15 1:23
 */
public class RegisterEnumReflectTest {

    public static void main(String[] args) throws Exception {
        // Enum只有一个protected的构造方法：protected Enum(String name, int ordinal) {}
        Class<RegisterEnum> clazz = RegisterEnum.class;
        Constructor<RegisterEnum> c = clazz.getDeclaredConstructor(String.class, int.class);
        c.setAccessible(true);
        // 利用反射newInstance方法会抛出异常：Cannot reflectively create enum objects
        // 原因：JDK源码中【newInstance方法】不允许枚举类型通过反射创建实例。
        RegisterEnum instance = c.newInstance("INSTANCE", 1);
        System.out.println(instance);
    }

}

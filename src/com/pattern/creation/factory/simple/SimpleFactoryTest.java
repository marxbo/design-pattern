package com.pattern.creation.factory.simple;

import com.pattern.creation.factory.Milk;

/**
 * 简单工厂测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:32
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Milk milk = factory.getMilk("特仑苏");
        System.out.println(milk);
    }

}

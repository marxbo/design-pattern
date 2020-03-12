package com.pattern.creation.factory.simple;

import com.pattern.creation.factory.model.milk.Milk;

/**
 * 简单工厂模式-原版测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:32
 */
public class SimpleFactory1Test {

    public static void main(String[] args) {
        SimpleFactory1 factory = new SimpleFactory1();
        Milk milk = factory.getMilk("特仑苏");
        System.out.println(milk);
    }

}

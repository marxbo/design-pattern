package com.pattern.creation.factory.simple;

import com.pattern.creation.factory.model.milk.Milk;

/**
 * 简单工厂-优化版测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:32
 */
public class SimpleFactory2Test {

    public static void main(String[] args) {
        SimpleFactory2 factory = new SimpleFactory2();
        Milk milk = factory.getMilk("com.pattern.creation.factory.model.milk.Telunsu");
        System.out.println(milk);
    }

}

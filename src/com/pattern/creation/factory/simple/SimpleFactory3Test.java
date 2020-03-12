package com.pattern.creation.factory.simple;

import com.pattern.creation.factory.model.milk.Milk;
import com.pattern.creation.factory.model.milk.Telunsu;

/**
 * 简单工厂模式-增强版测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:32
 */
public class SimpleFactory3Test {

    public static void main(String[] args) {
        SimpleFactory3 factory = new SimpleFactory3();
        Milk milk = factory.getMilk(Telunsu.class);
        System.out.println(milk);
    }

}

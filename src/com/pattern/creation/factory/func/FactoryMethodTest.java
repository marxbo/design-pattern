package com.pattern.creation.factory.func;

import com.pattern.creation.factory.Milk;

/**
 * 工厂方法测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:46
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        Factory factory = new MengniuFactory();
        Milk milk = factory.getMilk();
        System.out.println(milk);
    }

}

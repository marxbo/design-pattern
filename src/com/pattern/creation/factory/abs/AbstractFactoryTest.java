package com.pattern.creation.factory.abs;

import com.pattern.creation.factory.Milk;

/**
 * 抽象工厂测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:45
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory = new MilkFactory();
        Milk milk = factory.getMengniu();
        System.out.println(milk);
    }

}

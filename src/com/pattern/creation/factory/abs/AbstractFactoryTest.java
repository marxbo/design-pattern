package com.pattern.creation.factory.abs;

import com.pattern.creation.factory.model.milk.Milk;
import com.pattern.creation.factory.model.tea.Tea;

/**
 * 抽象工厂测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:45
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        AbstractFactory factory1 = new DrinkFactory1();
        Milk milk1 = factory1.getMilk();
        Tea tea1 = factory1.getTea();
        System.out.println("饮料工厂1生产：" + milk1.getName() + "、" + tea1.getName());

        AbstractFactory factory2 = new DrinkFactory2();
        Milk milk2 = factory2.getMilk();
        Tea tea2 = factory2.getTea();
        System.out.println("饮料工厂2生产：" + milk2.getName() + "、" + tea2.getName());
    }

}

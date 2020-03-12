package com.pattern.creation.factory.func;

import com.pattern.creation.factory.func.milk.MengniuFactory;
import com.pattern.creation.factory.func.milk.MilkFactory;
import com.pattern.creation.factory.func.tea.GreenTeaFactory;
import com.pattern.creation.factory.func.tea.TeaFactory;
import com.pattern.creation.factory.model.milk.Milk;
import com.pattern.creation.factory.model.tea.Tea;

/**
 * 工厂方法测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:46
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        MilkFactory milkFactory = new MengniuFactory();
        Milk milk = milkFactory.getMilk();
        System.out.println(milk);

        TeaFactory teaFactory = new GreenTeaFactory();
        Tea tea = teaFactory.getTea();
        System.out.println(tea);
    }

}

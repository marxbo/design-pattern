package com.pattern.creation.factory.func.milk;

import com.pattern.creation.factory.model.milk.Milk;

/**
 * 牛奶工厂
 *
 * 工厂方法模式：
 *      定义一个创建对象的接口，让其实现类来决定实例化哪个类，工厂方法让类的实例化推迟到子类中进行。
 * -优点：
 *      符合开闭原则。只需关心所需产品对应的工厂，无需关心创建细节。
 * -缺点：
 *      类的个数容易过多，增加复杂度。
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:34
 */
public interface MilkFactory {

    /**
     * 不同工厂生产不同类型牛奶
     *
     * @return Milk
     */
    Milk getMilk();

}

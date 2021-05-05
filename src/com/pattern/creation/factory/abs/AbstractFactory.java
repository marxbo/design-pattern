package com.pattern.creation.factory.abs;

import com.pattern.creation.factory.model.milk.Milk;
import com.pattern.creation.factory.model.tea.Tea;

/**
 * 抽象工厂：提供一个【创建一系列相关或相互依赖对象】的接口，无需指定具体的类。
 *
 * 与工厂方法的区别：抽象工厂解决的是横向的产品族，而工厂方法解决的是纵向的产品等级。
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:38
 */
public abstract class AbstractFactory {

    /**
     * 抽象工厂定义产品族各产品，工厂实现类具体实现各产品（每个具体工厂负责一个抽象工厂方法接口的实现）
     *
     * 横轴-产品族：一系列产品（不同产品）
     * 纵轴-产品等级：生产一系列产品的不同工厂
     */

    /**
     * 生产牛奶
     *
     * @return Milk
     */
    abstract Milk getMilk();

    /**
     * 生产茶水
     *
     * @return Tea
     */
    abstract Tea getTea();

}

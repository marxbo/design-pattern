package com.pattern.factory.abs;

import com.pattern.factory.Milk;

/**
 * 抽象工厂：统一入口
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:38
 */
public abstract class AbstractFactory {

    abstract Milk getMengniu();

    abstract Milk getTelunsu();

    abstract Milk getYili();

}

package com.pattern.creation.factory.func.milk;

import com.pattern.creation.factory.model.milk.Milk;
import com.pattern.creation.factory.model.milk.Telunsu;
import com.pattern.creation.factory.model.milk.Yili;

/**
 * 特仑苏工厂
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:35
 */
public class YiliFactory implements MilkFactory {

    /**
     * 蒙牛工厂生产蒙牛牛奶
     *
     * @return Milk
     */
    @Override
    public Milk getMilk() {
        return new Yili();
    }

}

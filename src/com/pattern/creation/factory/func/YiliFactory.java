package com.pattern.creation.factory.func;

import com.pattern.creation.factory.Milk;
import com.pattern.creation.factory.Telunsu;

/**
 * 特仑苏工厂
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:35
 */
public class YiliFactory implements Factory {


    /**
     * 蒙牛工厂生产蒙牛牛奶
     *
     * @return
     */
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}

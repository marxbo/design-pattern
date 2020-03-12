package com.pattern.creation.factory.simple;

import com.pattern.creation.factory.model.milk.Milk;

/**
 * 简单工厂模式-增强版【增强可控性，无需强制转型】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/9 23:08
 */
public class SimpleFactory3 {

    /**
     * 根据牛奶类型获取牛奶对象
     *
     * @param clazz 类对象
     * @return Milk
     */
    public Milk getMilk(Class<? extends Milk> clazz) {
        try {
            if (clazz != null) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

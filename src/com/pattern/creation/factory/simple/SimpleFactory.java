package com.pattern.creation.factory.simple;

import com.pattern.creation.factory.Mengniu;
import com.pattern.creation.factory.Milk;
import com.pattern.creation.factory.Telunsu;
import com.pattern.creation.factory.Yili;

/**
 * 简单工厂模式
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:27
 */
public class SimpleFactory {

    /**
     * 根据牛奶类型获取牛奶对象
     *
     * @param name 牛奶类型
     * @return Milk
     */
    public Milk getMilk(String name) {
        if ("蒙牛".equals(name)) {
            return new Mengniu();
        } else if ("特仑苏".equals(name)) {
            return new Telunsu();
        } else if ("伊利".equals(name)) {
            return new Yili();
        } else {
            return null;
        }
    }

}

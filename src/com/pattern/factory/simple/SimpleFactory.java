package com.pattern.factory.simple;

import com.pattern.factory.Mengniu;
import com.pattern.factory.Milk;
import com.pattern.factory.Telunsu;
import com.pattern.factory.Yili;

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

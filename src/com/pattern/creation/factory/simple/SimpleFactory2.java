package com.pattern.creation.factory.simple;

import com.pattern.creation.factory.model.milk.Milk;

/**
 * 简单工厂模式-优化版【反射实现，避免多个if-else判断，符合开闭原则】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/9 23:08
 */
public class SimpleFactory2 {

    /**
     * 根据牛奶类型获取牛奶对象
     *
     * @param className 类全限定名
     * @return Milk
     */
    public Milk getMilk(String className) {
        try {
            if (className != null && !"".equals(className)) {
                return (Milk) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

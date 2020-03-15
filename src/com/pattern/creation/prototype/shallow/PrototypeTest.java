package com.pattern.creation.prototype.shallow;

/**
 * 原型模式-浅拷贝【对象拷贝中的引用拷贝】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/14 22:55
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Prototype p = new Prototype();
        try {
            // 克隆对象-浅拷贝
            Prototype obj = (Prototype) p.clone();
            obj.setName("b");
            obj.getList().add("2");
            // false-引用对象的地址改变
            System.out.println(p == obj);
            System.out.println("原型对象p：" + p + "；克隆对象obj：" + obj);
            // false-基本数据/String类型地址改变
            System.out.println(p.getName() == obj.getName());
            System.out.println("原型对象p的name属性：" + p.getName() + "；克隆对象obj的name属性：" + obj.getName());
            // true-引用类型地址不变
            System.out.println(p.getList() == obj.getList());
            System.out.println("原型对象p的list属性：" + p.getList() + "；克隆对象obj的list属性：" + obj.getList());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

package com.pattern.prototype.simple;

/**
 * 原型模式-浅拷贝【对象拷贝中的引用拷贝】
 * 注：拷贝分为引用拷贝和对象拷贝，对象拷贝又分为深拷贝和浅拷贝
 * (1) 基本数据类型和String对象能够自动实现深拷贝（值的复制）
 * (2) 浅拷贝只拷贝引用，不会拷贝对象，故对象的引用类型属性仍然指向原来的对象
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
            // false
            System.out.println(p == obj);
            // false
            System.out.println(p.getName() == obj.getName());
            // true-集合指向的对象不变
            System.out.println(p.getList() == obj.getList());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

package com.pattern.creation.prototype.deep;

import java.io.IOException;

/**
 * 原型模式-深拷贝【对象拷贝】
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
            Prototype p1 = (Prototype) p.clone();
            // false
            System.out.println(p == p1);
            // true
            System.out.println(p.getSub() == p1.getSub());

            // 克隆对象-深拷贝
            Prototype p2 = (Prototype) p.deepClone();
            // false
            System.out.println(p == p2);
            // false
            System.out.println(p.getSub() == p2.getSub());
        } catch (CloneNotSupportedException | IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package com.pattern.creation.prototype.deep;

import java.io.*;

/**
 * 原型模式-深拷贝【对象拷贝，序列化可实现深拷贝，继承Cloneable、Serializable接口和重写clone方法】
 *
 * 注：拷贝分为引用拷贝和对象拷贝，对象拷贝又分为深拷贝和浅拷贝。
 *      (1) 基本数据类型和String类型能够自动实现深拷贝（值的复制）。
 *      (2) 浅拷贝只拷贝基本数据类型和String，不会拷贝引用类型，故对象的引用类型属性仍然指向原来的对象。
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/14 22:51
 */
public class Prototype implements Cloneable, Serializable {

    private String name = "a";

    private SubPrototype sub = new SubPrototype();

    /**
     * 浅拷贝
     *
     * @return 克隆对象
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深拷贝-序列化
     *
     * @return 克隆对象
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        Prototype obj = (Prototype) ois.readObject();

        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubPrototype getSub() {
        return sub;
    }

    public void setSub(SubPrototype sub) {
        this.sub = sub;
    }
}

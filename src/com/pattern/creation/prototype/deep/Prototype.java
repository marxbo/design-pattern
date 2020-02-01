package com.pattern.creation.prototype.deep;

import java.io.*;

/**
 * 原型模式-深拷贝【序列化可实现深拷贝】
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
     * 深拷贝
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

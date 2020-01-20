package com.pattern.prototype.deep;

import java.io.Serializable;

/**
 * 原型对象的引用类型属性
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/17 20:21
 */
public class SubPrototype implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

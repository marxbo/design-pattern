package com.pattern.creation.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式-浅拷贝【继承Cloneable接口和重写clone方法】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/14 22:51
 */
public class Prototype implements Cloneable {

    private String name = "a";

    private List<String> list = new ArrayList<>();

    // 构造代码块
    {
        list.add("1");
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}

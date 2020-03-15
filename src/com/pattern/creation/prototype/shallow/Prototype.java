package com.pattern.creation.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式-浅拷贝【对象拷贝中的引用拷贝，继承Cloneable接口和重写clone方法】
 *
 * 注：拷贝分为引用拷贝和对象拷贝，对象拷贝又分为深拷贝和浅拷贝。
 *      (1) 基本数据类型和String类型能够自动实现深拷贝（值的复制）。
 *      (2) 浅拷贝只拷贝基本数据类型和String，不会拷贝引用类型，故对象的引用类型属性仍然指向原来的对象。
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

package com.pattern.structure.proxy.dynamic.cglib;

import com.pattern.structure.proxy.statical.Consumer;

/**
 * cglib动态代理测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:47
 */
public class CglibDynamicProxyTest {

    public static void main(String[] args) {
        // 动态代理处理类
        CglibDynamicProxyHandler dynamicProxyHandler = new CglibDynamicProxyHandler();
        // 在内存中动态生成代理对象
        Consumer consumer =  (Consumer) dynamicProxyHandler.getProxyInstance(Consumer.class);
        System.out.println(consumer.getClass());
        consumer.buyHouse();
    }

}

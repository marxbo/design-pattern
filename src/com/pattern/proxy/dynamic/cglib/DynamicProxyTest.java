package com.pattern.proxy.dynamic.cglib;

import com.pattern.proxy.dynamic.cglib.DynamicProxyHandler;
import com.pattern.proxy.statical.Consumer;
import com.pattern.proxy.statical.IBuyHouse;

/**
 * 动态代理测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:47
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        // 动态代理处理类
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler();
        // 在内存中动态生成代理对象
        Consumer consumer =  (Consumer) dynamicProxyHandler.getProxyInstance(Consumer.class);
        System.out.println(consumer.getClass());
        consumer.buyHouse();
    }

}

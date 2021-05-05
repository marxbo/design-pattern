package com.pattern.structure.proxy.dynamic.custom;

import com.pattern.structure.proxy.statical.Consumer;
import com.pattern.structure.proxy.statical.IBuyHouse;

/**
 * 自定义动态代理测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/28 22:29
 */
public class CustomProxyTest {

    public static void main(String[] args) {
        // 目标对象
        IBuyHouse houseBuyer = new Consumer();
        // 动态代理处理类
        CustomProxyHandler customProxyHandler = new CustomProxyHandler();
        // 在内存中动态生成代理对象
        IBuyHouse proxy = (IBuyHouse) customProxyHandler.getProxyInstance(houseBuyer);
        System.out.println(proxy.getClass());
        proxy.buyHouse();
    }

}

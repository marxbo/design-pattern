package com.pattern.structure.proxy.statical;

/**
 * 静态代理测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:47
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        IBuyHouse buyer = new Consumer();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyer);
        buyHouseProxy.buyHouse();
    }

}

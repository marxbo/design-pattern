package com.pattern.structure.proxy.statical;

/**
 * 静态代理测试-一个代理类代表一种行为/功能
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:47
 */
public class StaticProxyTest {

    public static void main(String[] args) {
        IBuyHouse houseBuyer = new Consumer();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(houseBuyer);
        buyHouseProxy.buyHouse();

        IBuyCar carBuyer = new Consumer();
        BuyCarProxy buyCarProxy = new BuyCarProxy(carBuyer);
        buyCarProxy.buyCar();
    }

}

package com.pattern.behavior.strategy;

/**
 * 策略模式测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/29 15:48
 */
public class PaymentTest {

    public static void main(String[] args) {
        // .....省略把商品添加到购物车，再从购物车下单
        // 直接从点单开始
        Order order = new Order("1", "20200101", 250.50);
        // 开始支付，选择微信支付、支付宝、银联、京东白条、财付通
        // 每个渠道
        System.out.println(order.pay(PayType.ALI_PAY));
    }

}

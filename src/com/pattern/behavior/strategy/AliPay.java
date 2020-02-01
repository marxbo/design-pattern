package com.pattern.behavior.strategy;

/**
 * 阿里支付
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/29 15:52
 */
public class AliPay implements Payment {

    @Override
    public PayState pay(String uid, double amount) {
        System.out.println("欢迎使用支付宝");
        System.out.println("查询账户余额，开始扣款");
        return new PayState(200, "支付成功", amount);
    }
}

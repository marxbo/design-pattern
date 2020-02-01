package com.pattern.behavior.strategy;

/**
 * 支付接口
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/29 15:33
 */
public interface Payment {

    PayState pay(String uid, double amount);

}

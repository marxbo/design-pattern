package com.pattern.behavior.strategy;

/**
 * 订单
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/29 15:28
 */
public class Order {

    /**
     * 编号
     */
    private String uid;

    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 金额
     */
    private double amount;

    public Order() {}

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    /**
     * 支付
     *
     * 为什么完全可以用Payment接口作为参数，却用PayType枚举？
     * 答：不需要写switch/if-else-if
     *
     * @param payType 支付渠道
     * @return 支付状态
     */
    public PayState pay(PayType payType) {
        return payType.getPayment().pay(this.uid, this.amount);
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

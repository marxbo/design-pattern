package com.pattern.behavior.strategy;

/**
 * 支付渠道
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/30 12:33
 */
public enum PayType {

    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WechatPay());

    private Payment payment;

    /**
     * 枚举的构造方法默认且只能用【private】修饰
     */
    PayType(Payment payment) {
        this.payment = payment;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
}

package com.pattern.behavior.chain;

/**
 * 购买请求
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/2 13:13
 */
public class BuyRequest {

    /**
     * 请求ID
     */
    private int id = 0;

    /**
     * 请求金额
     */
    private float price = 0.0f;

    /**
     * 备注
     */
    private String remark;

    public BuyRequest(int id, float price, String remark) {
        this.id = id;
        this.price = price;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}

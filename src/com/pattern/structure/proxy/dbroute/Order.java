package com.pattern.structure.proxy.dbroute;

/**
 * 订单
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/16 20:52
 */
public class Order {
    /**
     * 订单信息
     */
    private Object orderInfo;

    /**
     * 订单创建时间进行按年分库
     */
    private Long createTime;

    /**
     * 订单编号
     */
    private String id;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

package com.pattern.structure.proxy.dbroute;

/**
 * 订单Service接口
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/16 20:54
 */
public interface OrderService {

    /**
     * 创建订单
     *
     * @param order 订单
     * @return 1-创建成功
     */
    int createOrder(Order order);

}

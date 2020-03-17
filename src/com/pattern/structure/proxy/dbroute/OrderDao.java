package com.pattern.structure.proxy.dbroute;

/**
 * 订单DAO
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/16 20:56
 */
public class OrderDao {

    /**
     * 创建订单
     *
     * @param order 订单
     * @return 1-创建成功
     */
    public int insert(Order order) {
        System.out.println("OrderDao创建Order成功！");
        return 1;
    }

}

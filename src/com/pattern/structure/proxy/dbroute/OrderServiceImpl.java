package com.pattern.structure.proxy.dbroute;

/**
 * 订单Service实现类
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/16 20:55
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    public OrderServiceImpl() {
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }

}

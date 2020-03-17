package com.pattern.structure.proxy.dbroute.proxy;

import com.pattern.structure.proxy.dbroute.Order;
import com.pattern.structure.proxy.dbroute.OrderService;
import com.pattern.structure.proxy.dbroute.db.DynamicDataSourceEntry;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 动态切换数据源静态代理类
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/17 0:42
 */
public class OrderServiceStaticProxy implements OrderService {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private OrderService orderService;

    public OrderServiceStaticProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(sdf.format(new Date(time)));
        System.out.println("静态代理自动切换到【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        int result = orderService.createOrder(order);
        after();
        return result;
    }

    private void before(){
        System.out.println("Proxy before method.");
    }

    private void after(){
        System.out.println("Proxy after method.");
    }

}

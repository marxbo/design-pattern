package com.pattern.structure.proxy.dbroute.proxy;

import com.pattern.structure.proxy.dbroute.Order;
import com.pattern.structure.proxy.dbroute.OrderService;
import com.pattern.structure.proxy.dbroute.OrderServiceImpl;
import com.pattern.structure.proxy.dbroute.proxy.OrderServiceDynamicProxy;
import com.pattern.structure.proxy.dbroute.proxy.OrderServiceStaticProxy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 动态切换数据源测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/17 0:48
 */
public class DbRouteProxyTest {

    public static void main(String[] args) throws ParseException {
        Order order = new Order();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        // 根据创建年份切换到DB_2020数据源
        Date date = sdf.parse("2020/01/01");
        order.setCreateTime(date.getTime());

        // 静态代理测试
        // OrderService orderService = new OrderServiceImpl();
        // OrderServiceStaticProxy proxy = new OrderServiceStaticProxy(orderService);
        // int result = proxy.createOrder(order);

        // 动态代理测试
        OrderService orderService = (OrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
        int result = orderService.createOrder(order);

        System.out.println("结果：" + result);
    }

}

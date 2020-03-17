package com.pattern.structure.proxy.dbroute.proxy;

import com.pattern.structure.proxy.dbroute.db.DynamicDataSourceEntry;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 动态切换数据源动态代理类
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/17 0:42
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

    private Object target;

    public Object getInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object result = method.invoke(target, args);
        after();
        return result;
    }

    private void before(Object arg){
        try {
            System.out.println("Proxy before method.");
            Long time = (Long) arg.getClass().getMethod("getCreateTime").invoke(arg);
            Integer dbRouter = Integer.valueOf(sdf.format(new Date(time)));
            System.out.println("静态代理自动切换到【DB_" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntry.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void after(){
        System.out.println("Proxy after method.");
    }
}

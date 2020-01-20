package com.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理对象-实现InvocationHandler接口【不需要实现代理行为接口】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:56
 */
public class DynamicProxyHandler implements MethodInterceptor {

    public Object getProxyInstance(Class<?> clazz) {
        // 创建增强器
        Enhancer enhancer = new Enhancer();
        // 指定父类
        enhancer.setSuperclass(clazz);
        // 设置回调
        enhancer.setCallback(this);
        // 使用增强器创建对象
        return enhancer.create();
    }

    /**
     * 【拦截对目标方法的调用，执行intercept】
     *
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib动态代理前操作");
        methodProxy.invokeSuper(o, objects);
        System.out.println("Cglib动态代理后操作");
        return null;
    }
}

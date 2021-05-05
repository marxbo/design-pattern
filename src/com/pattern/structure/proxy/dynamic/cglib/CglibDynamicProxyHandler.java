package com.pattern.structure.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib动态代理对象-实现MethodInterceptor接口
 * 注意：cglib原理是动态生成被代理类的子类。
 *      故cglib不能对final类/方法进行代理，因为它们无法被子类被继承/重写。
 *
 * cglib动态代理：
 * -优点：
 *      (1)基于字节码，生成真实对象的子类，没有用到反射，效率高于JDK动态代理
 *      (2)不需要实现接口
 * -缺点：
 *      非JDK功能，需要额外导入jar
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:56
 */
public class CglibDynamicProxyHandler implements MethodInterceptor {

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

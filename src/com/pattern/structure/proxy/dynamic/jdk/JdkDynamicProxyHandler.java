package com.pattern.structure.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理对象-实现InvocationHandler接口的invoke方法【不需要实现代理行为接口】
 *
 * JDK动态代理：
 * -优点：
 *      JDK自带，不需要导入jar
 * -缺点：
 *      (1)真实对象必须实现接口
 *      (2)利用反射机制，效率不高
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:56
 */
public class JdkDynamicProxyHandler implements InvocationHandler {

    /**
     * 目标对象
     */
    private Object target;

    /**
     * 创建代理对象-必须传入目标对象
     *
     * @param target 目标对象
     * @return 代理对象
     */
    public Object getProxyInstance(Object target) {
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(
                clazz.getClassLoader(),  // 类加载器
                clazz.getInterfaces(),   // 被代理类的所有接口类对象，也是动态代理类需要实现的接口
                this                  // 动态代理类
        );
    }

    /**
     * 代理行为【拦截对目标方法的调用，执行invoke】
     *
     * @param proxy 代理对象的引用（不一定每次都用得到）
     * @param method 当前执行的方法对象
     * @param args 执行方法所需的参数
     * @return 当前执行方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK动态代理前操作");
        method.invoke(this.target, args);
        System.out.println("JDK动态代理后操作");
        // 返回方法执行结果
        return null;
    }
}

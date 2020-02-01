package com.pattern.structure.proxy.dynamic.custom;

import java.lang.reflect.Method;

/**
 * 自定义InvocationHandler
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/28 13:37
 */
public interface InvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;

}

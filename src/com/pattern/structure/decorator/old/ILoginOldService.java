package com.pattern.structure.decorator.old;


import com.pattern.structure.decorator.Result;

/**
 * 旧登录接口-待增强【只包含待增强的方法】
 * 1、适配器模式：
 *      (1)主要功能：兼容【原本功能依旧可用，拓展新功能】
 *      (2)实现方式：【继承】或【代理】
 * 2、装饰器模式：
 *      (1)主要功能：增强【对原来功能的增强，本质不变】
 *      (2)实现方式：【实现同个接口】加【代理】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 16:11
 */
public interface ILoginOldService {

    /**
     * 旧注册接口适配
     *
     * @param username
     * @param password
     * @return
     */
    Result regist(String username, String password);

    /**
     * 旧登录接口适配
     *
     * @param username
     * @param password
     * @return
     */
    Result login(String username, String password);

}

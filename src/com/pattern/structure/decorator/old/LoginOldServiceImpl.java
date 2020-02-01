package com.pattern.structure.decorator.old;

import com.pattern.behavior.template.entity.Member;
import com.pattern.structure.decorator.Result;

/**
 * 旧登录Service-待增强【需要实现ILoginService接口】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 0:52
 */
public class LoginOldServiceImpl implements ILoginOldService {

    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result regist(String username, String password){
        System.out.println("我是包装在新注册方法里面的、原来的注册方法");
        return new Result(200,"注册成功", new Member());
    }


    /**
     * 登录方法
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result login(String username,String password){
        String token = "login-token";
        System.out.println("我是包装在新登录方法里面的、原来的登录方法");
        return new Result(200,"登录成功", token);
    }

}

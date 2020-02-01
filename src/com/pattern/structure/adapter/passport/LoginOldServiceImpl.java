package com.pattern.structure.adapter.passport;

import com.pattern.behavior.template.entity.Member;
import com.pattern.structure.adapter.Result;

/**
 * 旧登录Service-待适配【无需实现ILoginService接口】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 0:52
 */
public class LoginOldServiceImpl {

    /**
     * 注册方法
     *
     * @param username
     * @param password
     * @return
     */
    public Result regist(String username, String password){
        return new Result(200,"注册成功", new Member());
    }


    /**
     * 登录方法
     *
     * @param username
     * @param password
     * @return
     */
    public Result login(String username,String password){
        String token = "login-token";
        return new Result(200,"登录成功", token);
    }

}

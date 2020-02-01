package com.pattern.structure.adapter.third;

import com.pattern.structure.adapter.Result;

/**
 * QQ登录
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 13:13
 */
public class LoginForQQUtil {

    /**
     * QQ登录
     *
     * @param username
     * @param password
     * @return
     */
    public Result login(String username, String password) {
        String token = "qq-login-token";
        return new Result(200,"QQ登录成功", token);
    }

}

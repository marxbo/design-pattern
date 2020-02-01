package com.pattern.structure.adapter.third;

import com.pattern.structure.adapter.Result;

/**
 * 微信登录
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 13:13
 */
public class LoginForWechatUtil {

    /**
     * 微信登录
     *
     * @param username
     * @param password
     * @return
     */
    public Result login(String username, String password) {
        String token = "wechat-login-token";
        return new Result(200,"微信登录成功", token);
    }

}

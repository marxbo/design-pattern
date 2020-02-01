package com.pattern.structure.adapter.third;

import com.pattern.structure.adapter.Result;
import com.pattern.structure.adapter.passport.ILoginService;
import com.pattern.structure.adapter.passport.LoginOldServiceImpl;

/**
 * 第三方登录-类的适配器模式【继承待适配类、实现适配接口】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 0:53
 */
public class LoginForThirdServiceImplA extends LoginOldServiceImpl implements ILoginService {

    /**
     * QQ登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result loginForQQ(String username, String password) {
        return new LoginForQQUtil().login(username, password);
    }

    /**
     * 微信登录
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result loginForWechat(String username, String password) {
        return new LoginForWechatUtil().login(username, password);
    }
}

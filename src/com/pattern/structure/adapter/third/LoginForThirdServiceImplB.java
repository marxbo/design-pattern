package com.pattern.structure.adapter.third;

import com.pattern.structure.adapter.Result;
import com.pattern.structure.adapter.passport.ILoginService;
import com.pattern.structure.adapter.passport.LoginOldServiceImpl;

/**
 * 第三方登录-对象的适配器模式【实现适配接口、并持有待适配类的实例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 0:53
 */
public class LoginForThirdServiceImplB implements ILoginService {

    private LoginOldServiceImpl loginOldService;

    public LoginForThirdServiceImplB(LoginOldServiceImpl loginOldService) {
        this.loginOldService = loginOldService;
    }

    /**
     * 旧注册接口适配
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result regist(String username, String password) {
        return loginOldService.regist(username, password);
    }

    /**
     * 旧登录接口适配
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result login(String username, String password) {
        return loginOldService.login(username, password);
    }

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

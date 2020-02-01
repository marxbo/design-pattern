package com.pattern.structure.decorator;

import com.pattern.structure.decorator.old.ILoginOldService;
import com.pattern.structure.decorator.old.LoginOldServiceImpl;
import com.pattern.structure.decorator.upgrade.LoginNewServiceImpl;

/**
 * 装饰器模式测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 0:50
 */
public class LoginTest {

    public static void main(String[] args) {
        ILoginOldService loginOldService = new LoginOldServiceImpl();
        LoginNewServiceImpl loginNewService = new LoginNewServiceImpl(loginOldService);
        loginNewService.login("username",  "password");
    }

}

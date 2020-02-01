package com.pattern.structure.adapter;

import com.pattern.structure.adapter.passport.ILoginService;
import com.pattern.structure.adapter.third.LoginForThirdServiceImplA;

/**
 * 适配器模式测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 0:50
 */
public class LoginTest {

    public static void main(String[] args) {
        ILoginService loginService = new LoginForThirdServiceImplA();
        // ILoginService loginService = new LoginForThirdServiceB();
        Result result = loginService.login("username", "password");
        Result resultForQQ = loginService.loginForQQ("username", "password");
        Result resultForWechat = loginService.loginForWechat("username", "password");
        System.out.println(result);
        System.out.println(resultForQQ);
        System.out.println(resultForWechat);
    }

}

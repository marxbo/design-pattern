package com.pattern.structure.decorator.upgrade;

import com.pattern.behavior.template.entity.Member;
import com.pattern.structure.decorator.Result;
import com.pattern.structure.decorator.old.ILoginOldService;
import com.pattern.structure.decorator.old.LoginOldServiceImpl;

/**
 * 新登录Service-增强后的实现类【实现增强接口，即间接实现了旧登录接口】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 16:23
 */
public class LoginNewServiceImpl implements ILoginNewService {

    private ILoginOldService loginOldService;

    public LoginNewServiceImpl(ILoginOldService loginOldService) {
        this.loginOldService = loginOldService;
    }

    /**
     * 增强的注册方法
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result regist(String username, String password){
        System.out.println("=============加密增强=============");
        return loginOldService.regist(username, password);
    }


    /**
     * 增强的登录方法
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public Result login(String username,String password){
        System.out.println("=============加密增强=============");
        return loginOldService.login(username, password);
    }
}

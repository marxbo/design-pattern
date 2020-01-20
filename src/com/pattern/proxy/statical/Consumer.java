package com.pattern.proxy.statical;

/**
 * 目标对象【继承代理行为接口】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:31
 */
public class Consumer implements IBuyHouse {

    @Override
    public void buyHouse() {
        System.out.println("我要买房");
    }

}

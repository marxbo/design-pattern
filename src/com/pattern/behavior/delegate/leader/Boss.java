package com.pattern.behavior.delegate.leader;

/**
 * 老板-要求者
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/31 23:27
 */
public class Boss {

    /**
     * 客户请求(Boss)、委派者(Leader)、被委派者(ITarget)
     * 委派者要持有被委派者的引用
     *
     * 委派模式：【静态代理】和【策略模式】的一种特殊组合
     * 代理模式：注重过程；  委派模式：注重结果；
     * 策略模式：注重可扩展；委派模式：注重内部的灵活和复用
     */

    public static void main(String[] args) {
        new Leader().doing("登录");
    }

}

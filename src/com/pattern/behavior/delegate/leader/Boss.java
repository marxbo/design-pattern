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
     * 委派者要持有被委派者的引用。
     * 核心：分发、调度、派遣
     *
     * 委派模式：【静态代理】和【策略模式】的一种特殊组合
     * 代理模式：注重过程；  委派模式：注重结果；
     * 策略模式：注重可扩展；委派模式：注重内部的灵活和复用
     */

    public static void main(String[] args) {
        new Boss().command("登录", new Leader());
    }

    /**
     * 委派Leader分发任务
     *
     * @param command
     * @param leader
     */
    public void command(String command, Leader leader) {
        leader.doing(command);
    }

}

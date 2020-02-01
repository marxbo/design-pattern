package com.pattern.behavior.delegate.leader;

/**
 * 小弟B-被委派者
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/31 23:28
 */
public class TargetB implements ITarget {

    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "的工作");
    }
}

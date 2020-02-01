package com.pattern.behavior.observer.subject;

import com.pattern.behavior.observer.core.Event;

/**
 * 观察者
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 17:11
 */
public class Observer {

    public void advice(Event e) {
        System.out.println("======触发事件，打印日志=====");
        System.out.println(e);
    }

}

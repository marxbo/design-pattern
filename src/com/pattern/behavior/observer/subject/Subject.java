package com.pattern.behavior.observer.subject;

import com.pattern.behavior.observer.core.EventListener;

/**
 * 被观察者主体
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 17:11
 */
public class Subject extends EventListener {

    public void add() {
        System.out.println("调用添加的方法");
        trigger(SubjectEventType.ON_ADD);
    }

    public void delete() {
        System.out.println("调用删除的方法");
        trigger(SubjectEventType.ON_DELETE);
    }

}

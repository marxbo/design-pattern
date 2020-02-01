package com.pattern.behavior.observer.subject;

import com.pattern.behavior.observer.core.Event;

import java.lang.reflect.Method;

/**
 * 观察者模式测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 22:44
 */
public class ObserverTest {

    public static void main(String[] args) {
        try {
            Observer observer = new Observer();
            Method advice = Observer.class.getMethod("advice", new Class[]{Event.class});

            Subject subject = new Subject();
            subject.addListener(SubjectEventType.ON_ADD, observer, advice);
            subject.addListener(SubjectEventType.ON_DELETE, observer, advice);

            subject.add();
            subject.delete();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

}

package com.pattern.behavior.observer.core;

import java.lang.reflect.Method;

/**
 * 事件
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 17:15
 */
public class Event {

    /**
     * 事件源
     */
    private Object source;

    /**
     * 通知对象
     */
    private Object target;

    /**
     * 回调
     */
    private Method callback;

    /**
     * 触发
     */
    private String trigger;

    /**
     * 时间
     */
    private long time;

    public Event() {}

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}

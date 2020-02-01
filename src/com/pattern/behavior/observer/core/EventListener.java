package com.pattern.behavior.observer.core;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/1 17:21
 */
public class EventListener {

    /**
     * 事件的注册和监听
     */
    protected Map<Enum, Event> events = new HashMap<>();

    /**
     * 注册监听事件
     *
     * @param eventType
     * @param target
     * @param callback
     */
    public void addListener(Enum eventType, Object target, Method callback) {
        // 注册事件
        // 用反射调用这个方法
        events.put(eventType, new Event(target, callback));
    }

    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try {
            event.getCallback().invoke(event.getTarget(), event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void trigger(Enum call) {
        if (!this.events.containsKey(call)) {
            return;
        }
        Event event = this.events.get(call);
        event.setTrigger(call.toString());
        this.trigger(event);
    }

}

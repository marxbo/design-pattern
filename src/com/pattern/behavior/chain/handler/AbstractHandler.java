package com.pattern.behavior.chain.handler;

/**
 * 抽象处理者-负责分发处理请求【请求和处理分开，实现解耦】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/2 13:09
 */
public abstract class AbstractHandler {

    /**
     * 下一个处理者
     */
    Handler handler;

    /**
     * 处理者姓名
     */
    private String name;

    public AbstractHandler(String name) {
        this.name = name;
    }

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

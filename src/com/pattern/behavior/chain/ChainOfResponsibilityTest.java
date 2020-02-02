package com.pattern.behavior.chain;

import com.pattern.behavior.chain.handler.*;

/**
 * 责任链模式测试
 *
 * 责任链模式(Chain of Responsibility)：
 *      使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系。
 *      将这些对象连成一条链，并沿着这条链传递该请求，直到有对象能够处理它
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/2 12:57
 */
public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        BuyRequest request = new BuyRequest(1, 1000, "申购IT设备");

        HandlerA handlerA = new HandlerA("开发组长");
        HandlerB handlerB = new HandlerB("项目经理");
        HandlerC handlerC = new HandlerC("部门经理");

        handlerA.setHandler(handlerB);
        handlerB.setHandler(handlerC);

        handlerA.processRequest(request);
    }

}

package com.pattern.behavior.chain;

import com.pattern.behavior.chain.handler.*;

/**
 * 责任链模式测试
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

package com.pattern.behavior.chain.handler;

import com.pattern.behavior.chain.BuyRequest;

/**
 * 处理人B
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/2 13:19
 */
public class HandlerB extends AbstractHandler implements Handler {

    public HandlerB(String name) {
        super(name);
    }

    /**
     * 处理金额100到500的购买请求
     *
     * @param request
     */
    @Override
    public void processRequest(BuyRequest request) {
        if (request.getPrice() > 100 && request.getPrice() <= 500) {
            System.out.println(
                    "购买请求[编号：" + request.getId() + ", " +
                            "金额：" + request.getPrice() + ", " +
                            "备注：" + request.getRemark() + "]" +
                            "被审批人[" + this.getName() + "]处理");
        } else {
            // 交给下一个审批人处理
            this.handler.processRequest(request);
        }
    }
}

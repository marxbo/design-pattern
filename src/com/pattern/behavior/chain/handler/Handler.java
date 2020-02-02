package com.pattern.behavior.chain.handler;

import com.pattern.behavior.chain.BuyRequest;

/**
 * 处理接口【请求和处理分开，实现解耦】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/2/2 13:10
 */
public interface Handler {

    /**
     * 处理审批购买请求的方法
     * @param request
     */
    void processRequest(BuyRequest request);

}

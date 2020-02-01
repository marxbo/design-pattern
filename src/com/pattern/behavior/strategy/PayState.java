package com.pattern.behavior.strategy;

/**
 * 支付状态
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/1/29 15:41
 */
public class PayState {

    /**
     * 支付编码
     */
    private int code;

    /**
     * 支付信息
     */
    private String msg;

    /**
     * 支付详情
     */
    private Object data;


    public PayState() {}

    public PayState(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "支付状态【" +
                "code=" + code +
                ", msg=" + msg +
                ", data=" + data +
                '】';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}

package com.pattern.factory;

/**
 * 蒙牛
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:24
 */
public class Mengniu implements Milk {

    /**
     * 获取牛奶类型名称
     *
     * @return String
     */
    @Override
    public String getName() {
        return "蒙牛";
    }
}

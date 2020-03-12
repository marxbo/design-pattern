package com.pattern.creation.factory.model.tea;

/**
 * 普洱茶
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/11 0:25
 */
public class PuerTea implements Tea {

    /**
     * 获取茶水类型名称
     *
     * @return String
     */
    @Override
    public String getName() {
        return "普洱茶";
    }
}

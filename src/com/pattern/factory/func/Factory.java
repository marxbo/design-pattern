package com.pattern.factory.func;

import com.pattern.factory.Milk;

/**
 * 工厂接口
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:34
 */
public interface Factory {

    /**
     * 不同工厂生产不同类型牛奶
     *
     * @return
     */
    Milk getMilk();

}

package com.pattern.creation.factory.func.tea;

import com.pattern.creation.factory.model.tea.Tea;

/**
 * 茶水工厂
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/11 0:39
 */
public interface TeaFactory {

    /**
     * 不同工厂生产不同类型茶水
     *
     * @return Tea
     */
    Tea getTea();

}

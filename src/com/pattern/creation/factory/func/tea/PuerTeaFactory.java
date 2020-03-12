package com.pattern.creation.factory.func.tea;

import com.pattern.creation.factory.model.tea.PuerTea;
import com.pattern.creation.factory.model.tea.Tea;

/**
 * 普洱茶工厂
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/11 0:43
 */
public class PuerTeaFactory implements TeaFactory {

    /**
     * 普洱茶工厂负责生产普洱茶
     *
     * @return Tea
     */
    @Override
    public Tea getTea() {
        return new PuerTea();
    }

}

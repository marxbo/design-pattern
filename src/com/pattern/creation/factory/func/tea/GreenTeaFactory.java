package com.pattern.creation.factory.func.tea;

import com.pattern.creation.factory.model.tea.GreenTea;
import com.pattern.creation.factory.model.tea.Tea;

/**
 * 绿茶工厂
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/11 0:43
 */
public class GreenTeaFactory implements TeaFactory {

    /**
     * 绿茶工厂负责生产绿茶
     *
     * @return Tea
     */
    @Override
    public Tea getTea() {
        return new GreenTea();
    }

}

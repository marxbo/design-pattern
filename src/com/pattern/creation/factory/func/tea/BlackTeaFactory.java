package com.pattern.creation.factory.func.tea;

import com.pattern.creation.factory.model.tea.BlackTea;
import com.pattern.creation.factory.model.tea.Tea;

/**
 * 红茶工厂
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/11 0:43
 */
public class BlackTeaFactory implements TeaFactory {

    /**
     * 红茶工厂负责生产红茶
     *
     * @return Tea
     */
    @Override
    public Tea getTea() {
        return new BlackTea();
    }

}

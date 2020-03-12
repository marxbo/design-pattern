package com.pattern.creation.factory.abs;

import com.pattern.creation.factory.func.milk.TelunsuFactory;
import com.pattern.creation.factory.func.tea.GreenTeaFactory;
import com.pattern.creation.factory.func.tea.TeaFactory;
import com.pattern.creation.factory.model.milk.Milk;
import com.pattern.creation.factory.model.tea.Tea;

/**
 * 饮料经销商1【特仑苏+绿茶】：负责生产多种饮料产品组合
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:42
 */
public class DrinkFactory1 extends AbstractFactory {

    /**
     * 生产牛奶【具体产品类型需要选择具体的产品供应商】
     *
     * @return Milk
     */
    @Override
    Milk getMilk() {
        return new TelunsuFactory().getMilk();
    }

    /**
     * 生产茶水【具体产品类型需要选择具体的产品供应商】
     *
     * @return Tea
     */
    @Override
    Tea getTea() {
        return new GreenTeaFactory().getTea();
    }

}

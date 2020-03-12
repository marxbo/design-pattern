package com.pattern.creation.factory.abs;

import com.pattern.creation.factory.func.milk.TelunsuFactory;
import com.pattern.creation.factory.func.milk.YiliFactory;
import com.pattern.creation.factory.func.tea.GreenTeaFactory;
import com.pattern.creation.factory.func.tea.PuerTeaFactory;
import com.pattern.creation.factory.model.milk.Milk;
import com.pattern.creation.factory.model.tea.Tea;

/**
 * 饮料经销商2【伊利+普洱茶】：负责生产多种饮料产品组合的经销商
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:42
 */
public class DrinkFactory2 extends AbstractFactory {

    /**
     * 生产牛奶【具体产品类型需要选择具体的产品供应商】
     *
     * @return Milk
     */
    @Override
    Milk getMilk() {
        return new YiliFactory().getMilk();
    }

    /**
     * 生产茶水【具体产品类型需要选择具体的产品供应商】
     *
     * @return Tea
     */
    @Override
    Tea getTea() {
        return new PuerTeaFactory().getTea();
    }

}

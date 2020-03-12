package com.pattern.creation.factory.func.milk;

import com.pattern.creation.factory.model.milk.Mengniu;
import com.pattern.creation.factory.model.milk.Milk;

/**
 * 蒙牛工厂
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:35
 */
public class MengniuFactory implements MilkFactory {

    /**
     * 蒙牛工厂生产蒙牛牛奶
     *
     * @return
     */
    @Override
    public Milk getMilk() {
        return new Mengniu();
    }

}

package com.pattern.factory.abs;

import com.pattern.factory.Milk;
import com.pattern.factory.func.MengniuFactory;
import com.pattern.factory.func.TelunsuFactory;
import com.pattern.factory.func.YiliFactory;

/**
 * 牛奶工厂：经销商
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:42
 */
public class MilkFactory extends AbstractFactory {

    @Override
    Milk getMengniu() {
        return new MengniuFactory().getMilk();
    }

    @Override
    Milk getTelunsu() {
        return new TelunsuFactory().getMilk();
    }

    @Override
    Milk getYili() {
        return new YiliFactory().getMilk();
    }
}

package com.pattern.creation.factory.func;

import com.pattern.creation.factory.Mengniu;
import com.pattern.creation.factory.Milk;

/**
 * 蒙牛工厂
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:35
 */
public class MengniuFactory implements Factory {


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

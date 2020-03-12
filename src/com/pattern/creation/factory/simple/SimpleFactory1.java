package com.pattern.creation.factory.simple;

import com.pattern.creation.factory.model.milk.Mengniu;
import com.pattern.creation.factory.model.milk.Milk;
import com.pattern.creation.factory.model.milk.Telunsu;
import com.pattern.creation.factory.model.milk.Yili;

/**
 * 简单工厂模式-原版【增加类型需要修改代码逻辑，不符合开闭原则】
 * -优点：
 *      客户端只需要传入工厂类的参数，无需关心创建对象的逻辑。
 * -缺点：
 *      工厂类的职责相对过重，不易于扩展过于复杂的产品结构。
 * -应用：
 *      适用工厂类负责创建类较少的场景。如：Calendar的createCalendar、LoggerFactory
 *
 * 注：简单工厂不属于23种设计模式。
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 20:27
 */
public class SimpleFactory1 {

    /**
     * 根据牛奶类型获取牛奶对象
     *
     * @param name 牛奶类型
     * @return Milk
     */
    public Milk getMilk(String name) {
        if ("蒙牛".equals(name)) {
            return new Mengniu();
        } else if ("特仑苏".equals(name)) {
            return new Telunsu();
        } else if ("伊利".equals(name)) {
            return new Yili();
        } else {
            return null;
        }
    }

}

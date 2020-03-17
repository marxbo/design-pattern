package com.pattern.structure.proxy.statical;

/**
 * 中介-代理对象【与目标对象一样，继承代理行为接口】
 *
 * 静态代理：
 * -优点：
 *     能在不修改目标对象的情况下，进行功能增强和访问控制。
 * -缺点：
 *     代理对象必须和目标对象实现同一个接口。
 *     即一个代理类代表一种行为/功能。要拓展功能则要编写多个代理类；要修改功能则必须修改代理类逻辑。
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:35
 */
public class BuyCarProxy implements IBuyCar {

    private IBuyCar buyer;

    /**
     * 代理对象只能代理继承同一个接口的目标对象
     *
     * @param buyer
     */
    public BuyCarProxy(IBuyCar buyer) {
        this.buyer = buyer;
    }

    @Override
    public void buyCar() {
        System.out.println("买车前");
        buyer.buyCar();
        System.out.println("买车后");
    }

}

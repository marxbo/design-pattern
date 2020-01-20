package com.pattern.proxy.dynamic.jdk;

import com.pattern.proxy.statical.BuyHouseProxy;
import com.pattern.proxy.statical.Consumer;
import com.pattern.proxy.statical.IBuyHouse;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 动态代理测试
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/24 15:47
 */
public class DynamicProxyTest {

    public static void main(String[] args) throws IOException {
        // 目标对象
        IBuyHouse buyer = new Consumer();
        // 动态代理处理类
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler();
        // 在内存中动态生成代理对象
        IBuyHouse proxy = (IBuyHouse) dynamicProxyHandler.getProxyInstance(buyer);
        // 这样写会调到代理对象的toString方法
        // System.out.println(proxy);
        // 下面代码输出：class com.sun.proxy.$Proxy0
        System.out.println(proxy.getClass());
        proxy.buyHouse();

        // 生成代理代理类的字节码文件
        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{IBuyHouse.class});
        FileOutputStream fos = new FileOutputStream("D:\\$Proxy0.class");
        fos.write(bytes);
        fos.close();
    }

}

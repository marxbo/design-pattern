package com.pattern.creation.singleton.register.container;

/**
 * 注册式单例测试-容器缓存式单例【IOC中的单例模式即容器缓存式单例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/4 0:32
 */
public class RegisterContainerTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ConcurrentExecutor.execute(() -> {
            Object singleton = RegisterContainer.getBean("com.pattern.creation.factory.model.milk.Mengniu");
            System.out.println(singleton);
        }, 10, 6);
        long end = System.currentTimeMillis();
        System.out.println("总耗时：" + (start - end));
    }

}

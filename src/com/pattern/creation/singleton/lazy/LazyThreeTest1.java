package com.pattern.creation.singleton.lazy;

import java.util.concurrent.CountDownLatch;

/**
 * 懒汉单例模式测试-静态内部类【线程安全】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:20
 */
public class LazyThreeTest1 {

    public static void main(String[] args) {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);

        long beginTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                LazyThree instance = LazyThree.getInstance();
                // 并非每次打印都为同个对象【线程不安全】
                System.out.println(System.currentTimeMillis() + ":" + instance);
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 耗时与LazyOne差不多
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时：" + (endTime - beginTime));
    }

}

package com.pattern.singleton.hungry;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * 饿汉单例模式测试-立即加载【线程安全，但以空间换时间，占内存】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:20
 */
public class HungryTest {

    public static void main(String[] args) {
        int count = 100;
        CountDownLatch latch = new CountDownLatch(count);

        final Set<Hungry> syncSet = Collections.synchronizedSet(new HashSet<Hungry>());

        for (int i = 0; i < count; i++) {
            new Thread(() -> {
                Hungry instance = Hungry.getInstance();
                System.out.println(System.currentTimeMillis() + ":" + instance);
                latch.countDown();
            }).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

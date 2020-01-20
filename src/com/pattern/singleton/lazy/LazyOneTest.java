package com.pattern.singleton.lazy;

import java.util.concurrent.CountDownLatch;

/**
 * 懒汉单例模式测试-延迟加载【线程不安全，以时间换空间】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:20
 */
public class LazyOneTest {

    public static void main(String[] args) {

        // CountDownLatch的2个使用场景：
        // (1) 作为一个开关，N个子线程准备就绪，等待主线程的放行，然后子线程一起开始执行
        //      【CountDownLatch为1、线程中await、主线程countDown】
        // (2) 主线程等待N个子线程的处理结果，子线程都完成后，主线程继续执行
        //      【CountDownLatch为线程个数、线程中countDown、主线程await】

        // CountDownLatch的第2个使用场景
        CountDownLatch latch = new CountDownLatch(1);

        long beginTime = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    LazyOne instance = LazyOne.getInstance();
                    // 并非每次打印都为同个对象【线程不安全】
                    System.out.println(System.currentTimeMillis() + ":" + instance);
                    // 阻塞，等所有线程创建完毕再放行
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        latch.countDown();

        long endTime = System.currentTimeMillis();
        System.out.println("总耗时：" + (endTime - beginTime));
    }

}

package com.pattern.creation.singleton.threadlocal;

/**
 * ThreadLocal单例测试【同个线程中保证单例，天然线程安全】
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/15 23:07
 */
public class ThreadLocalSingletonTest {

    public static void main(String[] args) {
        // 主线程线程安全，保证单例
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());

        // 不同线程非线程安全，输出多例
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("End");
    }

}

class ExectorThread implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread() + ":" + ThreadLocalSingleton.getInstance());
    }

}

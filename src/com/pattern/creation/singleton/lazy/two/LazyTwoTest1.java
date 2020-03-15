package com.pattern.creation.singleton.lazy.two;

/**
 * 懒汉单例模式线程安全测试-加同步锁【用性能换取线程安全】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:20
 */
public class LazyTwoTest1 {

    public static void main(String[] args) {
        System.out.println("Executor Start");

        Thread t1 = new Thread(new ExecutorThreadTwo());
        Thread t2 = new Thread(new ExecutorThreadTwo());

        t1.start();
        t2.start();

        System.out.println("Executor End");
    }

}

class ExecutorThreadTwo implements Runnable {

    @Override
    public void run() {
        LazyTwo instance = LazyTwo.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }

}

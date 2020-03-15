package com.pattern.creation.singleton.lazy.one;

/**
 * 懒汉单例模式线程安全测试-延迟加载【线程不安全，以时间换空间】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:20
 */
public class LazyOneTest1 {

    public static void main(String[] args) {
        System.out.println("Executor Start");

        Thread t1 = new Thread(new ExecutorThreadOne());
        Thread t2 = new Thread(new ExecutorThreadOne());

        t1.start();
        t2.start();

        System.out.println("Executor End");
    }

}

class ExecutorThreadOne implements Runnable {

    @Override
    public void run() {
        LazyOne instance = LazyOne.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + instance);
    }

}

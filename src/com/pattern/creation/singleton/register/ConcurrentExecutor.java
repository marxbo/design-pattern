package com.pattern.creation.singleton.register;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 并发执行器
 *
 * @author marxbo
 * @version 1.0
 * @date 2020/3/15 2:13
 */
public class ConcurrentExecutor {

    /**
     * 并发执行方法
     *
     * @param runHandler 线程执行的内容
     * @param executeCount 线程数
     * @param concurrentCount 并发执行数
     */
    public static void execute(final RunHandler runHandler, int executeCount, int concurrentCount) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        // 控制信号量，用于控制并发的线程数
        final Semaphore semaphore = new Semaphore(concurrentCount);
        // 闭锁，可实现计数量递减
        final CountDownLatch countDownLatch = new CountDownLatch(executeCount);
        for (int i = 0; i < executeCount; i++) {
            executorService.execute(() -> {
                try {
                    // acquire：获取执行许可
                    // 允许concurrentCount个线程获得许可，即最大并发数是concurrentCount
                    semaphore.acquire();
                    runHandler.handler();
                    // 释放许可
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
    }

    /**
     * 运行控制器
     */
    public interface RunHandler {
        void handler();
    }

}


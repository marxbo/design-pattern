package com.pattern.creation.singleton.lazy;

/**
 * 懒汉单例模式(1)和(2)性能测试-加同步锁【用性能换取线程安全】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/10/27 21:20
 */
public class LazyTwoTest {

    public static void main(String[] args) {
        int count = 10000000;
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            // 懒汉模式不加同步锁耗时：4
            // LazyOne instance = LazyOne.getInstance();
            // 懒汉模式不加同步锁耗时：158
            LazyTwo instance = LazyTwo.getInstance();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时：" + (endTime - beginTime));
    }

}

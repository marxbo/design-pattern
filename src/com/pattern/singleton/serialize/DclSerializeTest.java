package com.pattern.singleton.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 双重检测锁式单例(DCL,Double Check Lock)测试-线程安全的懒汉式单例【线程安全、但序列化可以破坏单例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/12 23:02
 */
public class DclSerializeTest {

    /*
    问：为什么序列化可以破坏单例？
    答：在ois.readObject()的调用栈readOrdinaryObject方法中：
            Object obj = desc.isInstantiable() ? desc.newInstance() : null;
        因此序列化底层还是使用反射，创建了一个新的对象，破坏了单例。
     */

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Serialize.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            DclSerialize singleton1 = DclSerialize.getInstance();
            oos.writeObject(singleton1);

            FileInputStream fis = new FileInputStream("D:\\Serialize.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            DclSerialize singleton2 = (DclSerialize) ois.readObject();

            System.out.println(singleton1);
            System.out.println(singleton2);
            // false
            System.out.println(singleton1 == singleton2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

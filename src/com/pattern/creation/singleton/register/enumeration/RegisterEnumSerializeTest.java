package com.pattern.creation.singleton.register.enumeration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 注册式单例序列化测试-枚举式单例【线程安全、避免反射和反序列化侵入破坏单例】
 *
 * @author marxbo
 * @version 1.0
 * @date 2019/11/12 23:02
 */
public class RegisterEnumSerializeTest {

    public static void main(String[] args) {
        try {
            RegisterEnum s1 = RegisterEnum.getInstance();
            RegisterEnum s2 = null;
            // 为验证反序列化前的枚举和反序列化后的枚举是否为同个实例对象，设置s1的成员属性
            s1.setData(new Object());

            // 在项目的根目录下
            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s2 = (RegisterEnum) ois.readObject();
            ois.close();
            fis.close();

            // s1和s2为同个对象，其成员属性也相同
            System.out.println(s1.getData());
            System.out.println(s2.getData());
            // true
            System.out.println(s1.getData() == s2.getData());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

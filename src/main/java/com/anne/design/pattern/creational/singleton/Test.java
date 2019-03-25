package com.anne.design.pattern.creational.singleton;


import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Author: Anne Zhang
 * Date: 2019/3/10
 * Description:
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*
        // 多线程测试
        System.out.println("Program starts.");
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        t1.start();
        t2.start();
        System.out.println("Program ends.");
        */

        /*
        // 序列化测试
        HungrySingleton instance = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        HungrySingleton newInstance = (HungrySingleton) ois.readObject();
        System.out.println("instance: "+ instance);
        System.out.println("newInstance: "+ newInstance);
        System.out.println("instance == newInstance: "+ (instance == newInstance));
        */

        // 反射
        LazySingleton instance = LazySingleton.getInstance();
        Constructor<LazySingleton> constructor = LazySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazySingleton newInstance = constructor.newInstance();
        System.out.println("instance: "+ instance);
        System.out.println("newInstance: "+ newInstance);
        System.out.println("instance == newInstance: "+ (instance == newInstance));

    }
}


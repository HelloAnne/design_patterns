package com.anne.design.pattern.creational.singleton;

/**
 * Author: Anne Zhang
 * Date: 2019/3/10
 * Description:
 */
public class T implements Runnable {
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstance();
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        HungrySingleton instance = HungrySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+instance);
    }
}

package com.anne.design.pattern.creational.singleton;

/**
 * Author: Anne Zhang
 * Date: 2019/3/10
 * Description:
 */
public class DoubleCheckLazySingleton {
    private static volatile DoubleCheckLazySingleton instance;
    private DoubleCheckLazySingleton(){}

    public static DoubleCheckLazySingleton getInstance(){
        if (instance == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }
}

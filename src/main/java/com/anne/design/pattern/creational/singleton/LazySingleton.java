package com.anne.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Author: Anne Zhang
 * Date: 2019/3/10
 * Description:
 */
public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton(){}
    public static LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

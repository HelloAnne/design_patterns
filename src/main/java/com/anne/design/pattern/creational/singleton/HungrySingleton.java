package com.anne.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Author: Anne Zhang
 * Date: 2019/3/10
 * Description: 类加载时即创建
 */
public class HungrySingleton implements Serializable{
    private final static HungrySingleton instance;
    static {
        instance = new HungrySingleton();
    }
    private HungrySingleton(){
        if (instance != null) {
            throw new RuntimeException("单例模式构造器禁止反射调用。");
        }
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
    private Object readResolve(){
        return instance;
    }
}

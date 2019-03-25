package com.anne.design.pattern.creational.singleton;

import org.apache.ibatis.javassist.runtime.Inner;

/**
 * Author: Anne Zhang
 * Date: 2019/3/10
 * Description:
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}
    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();

    }
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }
}

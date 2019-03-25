package com.anne.design.pattern.creational.factorymethod;

/**
 * Author: Anne Zhang
 * Date: 2019/3/8
 * Description:
 */
public class PythonVideoFactory extends VideoFactory {
    public Video getInstance() {
        return new PythonVideo();
    }
}

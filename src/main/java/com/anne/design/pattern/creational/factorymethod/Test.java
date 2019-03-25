package com.anne.design.pattern.creational.factorymethod;

/**
 * Author: Anne Zhang
 * Date: 2019/3/5
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new MatlabVideoFactory();
        Video video = videoFactory.getInstance();
        video.produce();
    }
}

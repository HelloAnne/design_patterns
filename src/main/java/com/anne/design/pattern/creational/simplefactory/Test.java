package com.anne.design.pattern.creational.simplefactory;

/**
 * Author: Anne Zhang
 * Date: 2019/3/5
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getInstance("Java");
        video.produce();
        video = videoFactory.getInstance("Python");
        video.produce();;
    }
}

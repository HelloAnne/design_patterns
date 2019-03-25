package com.anne.design.pattern.creational.simplefactory;

/**
 * Author: Anne Zhang
 * Date: 2019/3/5
 * Description:
 */
public class VideoFactory {
    public Video getInstance(String type) {
        if ("Java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("Python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}

package com.anne.design.pattern.creational.abstractfactory;

/**
 * Author: Anne Zhang
 * Date: 2019/3/9
 * Description:
 */
public class JavaCourseFactory extends CourseFactory {
    public Video getVideo() {
        return new JavaVideo();
    }

    public Article getArticle() {
        return new JavaArticle();
    }
}

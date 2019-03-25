package com.anne.design.pattern.creational.abstractfactory;

/**
 * Author: Anne Zhang
 * Date: 2019/3/9
 * Description:
 */
public class PythonCourseFactory extends CourseFactory {
    public Video getVideo() {
        return new PythonVideo();
    }

    public Article getArticle() {
        return new PythonArticle();
    }
}

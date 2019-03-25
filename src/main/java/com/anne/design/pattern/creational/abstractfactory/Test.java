package com.anne.design.pattern.creational.abstractfactory;

/**
 * Author: Anne Zhang
 * Date: 2019/3/9
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        video.produce();
        Article article = courseFactory.getArticle();
        article.produce();
    }
}

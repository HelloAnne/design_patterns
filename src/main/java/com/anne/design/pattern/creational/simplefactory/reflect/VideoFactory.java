package com.anne.design.pattern.creational.simplefactory.reflect;

import java.util.Calendar;

/**
 * Author: Anne Zhang
 * Date: 2019/3/5
 * Description:
 */
public class VideoFactory {
    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;

    }
}

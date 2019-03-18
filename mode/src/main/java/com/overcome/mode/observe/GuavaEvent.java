package com.overcome.mode.observe;

import com.google.common.eventbus.Subscribe;

import java.util.Map;

/**
 * 监听事件
 *
 */
public class GuavaEvent {

    @Subscribe
    public void subscribe(Object msg) {
        Map<String, Object> map = (Map<String, Object>) msg;
        String teacName = (String) map.get("teacherName");
        String question = (String) map.get("question");
        System.out.println(teacName + "老师， 你有一条新的消息！消息内容：[" + question + "]");
    }
}

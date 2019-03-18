package com.overcome.mode.observe;

import com.google.common.eventbus.EventBus;

import java.util.HashMap;
import java.util.Map;

public class GuavaEventTest {


    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("teacherName", "Tom");
        map.put("question", "我来和老师取经啦!");
        EventBus eventBus = new EventBus();
        eventBus.register(new GuavaEvent());
        eventBus.post(map);
    }
}

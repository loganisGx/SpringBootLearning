package com.logan.springbootofficial.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Desc：MessageListener
 * Created by Logan-liugenxing on 2021/4/9 14:22.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class MessageListener implements ApplicationListener<MessageEvent> {

    private String name;


    public MessageListener(String name) {
        this.name = name;
    }

    @Override
    public void onApplicationEvent(MessageEvent event) {

        String source = (String) event.getSource();

        System.out.println("我是" + this.name + ",听到老大说：" + source);
    }
}

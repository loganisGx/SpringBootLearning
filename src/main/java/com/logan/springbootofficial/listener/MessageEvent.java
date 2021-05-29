package com.logan.springbootofficial.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Desc：MessageEvent
 * Created by Logan-liugenxing on 2021/4/9 14:23.
 * Copr：© 2021 Logan.All rights reserved.
 */
public class MessageEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MessageEvent(String source) {
        super(source);
    }
}

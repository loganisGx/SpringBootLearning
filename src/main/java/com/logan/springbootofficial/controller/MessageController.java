package com.logan.springbootofficial.controller;

import com.logan.springbootofficial.observer.MemberObserver;
import com.logan.springbootofficial.observer.MessageObservable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc：MessageController
 * Created by mskj-liugenxing on 2021/4/8 17:03.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
@RestController
public class MessageController {

    @RequestMapping("/send")
    public void send(@RequestParam(value = "masterName") String masterName, @RequestParam(value = "message") String message){
        MessageObservable observable = new MessageObservable();

        observable.addObserver(new MemberObserver("Yasuo"));
        observable.addObserver(new MemberObserver("Riven"));
        observable.addObserver(new MemberObserver("Timo"));

        observable.sendMessage(masterName,message);
    }
}

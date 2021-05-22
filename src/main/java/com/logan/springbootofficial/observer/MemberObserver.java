package com.logan.springbootofficial.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Desc：MemberObserver
 * Created by mskj-liugenxing on 2021/4/8 17:20.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
public class MemberObserver implements Observer {

    private String name;

    public MemberObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        MessageObservable messageObservable = (MessageObservable) o;

        String masterName = (String) arg;
        System.out.println("我是" + this.name + "，我们的群主" + masterName + "发话：" + messageObservable.getMessage());
    }


}

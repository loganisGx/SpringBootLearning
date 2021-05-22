package com.logan.springbootofficial.observer;

import java.util.Observable;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Desc：MessageObservable
 * Created by mskj-liugenxing on 2021/4/8 17:07.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
public class MessageObservable extends Observable {
    private String message;

    public void sendMessage(String master, String message){
        this.message = message;

        //改变状态
        this.setChanged();

        //通知所有观察者
        this.notifyObservers(master);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

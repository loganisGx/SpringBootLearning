package com.logan.springbootofficial.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Desc：Equipment
 * Created by mskj-liugenxing on 2021/5/12 10:29.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
@Component
@ConfigurationProperties(prefix = "myequipment")
public class Equipment {
    private String name;
    private String power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}

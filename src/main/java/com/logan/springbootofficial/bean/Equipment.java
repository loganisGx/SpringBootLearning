package com.logan.springbootofficial.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Desc：Equipment
 * Created by Logan-liugenxing on 2021/5/12 10:29.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Component
@ConfigurationProperties(prefix = "myequipment")
public class Equipment {
    private String name;
    private String power;
    private List<String> elements;

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

    public List<String> getElements() {
        return elements;
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", elements=" + elements +
                '}';
    }
}

package com.logan.springbootofficial.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Desc：Hero
 * Created by Logan-liugenxing on 2021/5/13 12:45.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Component
@ConfigurationProperties(prefix = "hero")
@Data
@ToString
public class Hero {
    private String name;
    private Integer age;
    private Date birthday;
    private Elf elf;
    private List<String> skills;
    private Map<String,Object> friends;
    private Map<String,List<Girl>> girlFriends;
}

package com.logan.springbootofficial.controller;

import com.logan.springbootofficial.bean.spring.Logan;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc：UserController
 * Created by Logan-liugenxing on 2021/3/14 10:51.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private Logan logan;

    @RequestMapping("/welcome")
    public String welcome(){
        return "Hello World,This is SpringBoot!";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/logan")
    public String getLogan(){
        log.info(logan.toString());
        return logan.toString();
    }
}

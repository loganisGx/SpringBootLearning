package com.logan.springbootofficial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc：UserController
 * Created by mskj-liugenxing on 2021/3/14 10:51.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
@RestController
public class UserController {

    @RequestMapping("/welcome")
    public String welcome(){
        return "Hello World,This is SpringBoot!";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}

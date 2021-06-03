package com.logan.springbootofficial.controller;

import com.logan.springbootofficial.bean.Hero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc：HeroController
 * Created by Logan-liugenxing on 2021/5/13 14:48.
 * Copr：© 2021 Logan.All rights reserved.
 */
@RestController
@Slf4j
public class HeroController {

    @Autowired
    private Hero hero;

    @RequestMapping("/yasuo")
    public Hero getHero(){
        log.info("这是controller方法{}",this.getClass().getName());
        return hero;
    }
}

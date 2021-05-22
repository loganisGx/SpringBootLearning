package com.logan.springbootofficial.controller;

import com.logan.springbootofficial.bean.Elf;
import com.logan.springbootofficial.bean.Equipment;
import com.logan.springbootofficial.bean.Magician;
import com.logan.springbootofficial.bean.Warrior;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc：MonsterController
 * Created by mskj-liugenxing on 2021/5/12 10:16.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
@RestController
@Slf4j
public class MonsterController {

    @Autowired
    private Equipment equipment;
    @Autowired
    private Magician magician;
    @Autowired
    private Elf elf;
    @Autowired
    private Warrior warrior;

    @RequestMapping("/getEquipment")
    public Equipment getEquipment(){
        return equipment;
    }

    @RequestMapping("/getMagician")
    public Magician getMagician(){
        log.info("召唤黑魔术师！");
        magician.setElf(elf);
        return magician;
    }

    @RequestMapping("/getElf")
    public Elf getElf(){
        log.info("召唤皮卡丘！");
        return elf;
    }

    @RequestMapping("/getWarrior")
    public Warrior getWarrior(){
        log.info("召唤混沌战士！");
        return warrior;
    }
}

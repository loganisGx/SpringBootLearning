package com.logan.springbootofficial.config;

import com.logan.springbootofficial.bean.*;
import com.logan.springbootofficial.model.User;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.origin.TextResourceOrigin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.io.Resource;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.nio.charset.StandardCharsets;

/**
 * Desc：MonsterAutoConfiguration
 * Created by Logan-liugenxing on 2021/5/12 9:18.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Configuration(proxyBeanMethods = false)
//@EnableConfigurationProperties(Equipment.class)
//@Import({Elf.class,Magician.class,Warrior.class})
public class MonsterAutoConfiguration {

    @Bean
    public User user01(){
        return new User();
    }

    @Bean
    public Magician darkMagician(){
        Magician magician = new Magician("DarkMagician", 2500, 2100, "Kill all enemies");
        //magician.setElf(elf01());
        return magician;
    }

    @Bean
    public Warrior warrior01(){
        return new Warrior("ChaosWarrior",3000,2500,"Sword","small shield");
    }

    @Bean
    public Elf elf01(){
        return new Elf("Pikaqiu","One hundred thousand volt");
    }
}

package com.logan.springbootofficial.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Desc：Warrior
 * Created by mskj-liugenxing on 2021/5/12 9:08.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
@ToString
@Data
@NoArgsConstructor
public class Warrior extends Monster{
    private String weapon;
    private String shield;

    public Warrior(String name, Integer attack, Integer defend, String weapon, String shield) {
        super(name, attack, defend);
        this.weapon = weapon;
        this.shield = shield;
    }

}

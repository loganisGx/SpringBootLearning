package com.logan.springbootofficial.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Desc：Magician
 * Created by mskj-liugenxing on 2021/5/12 9:06.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
public class Magician extends Monster{
    private String magic;

    private Elf elf;

    public Magician() {
    }

    public Magician(String name, Integer attack, Integer defend, String magic) {
        super(name,attack,defend);
        this.magic = magic;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public Elf getElf() {
        return elf;
    }

    public void setElf(Elf elf) {
        this.elf = elf;
    }

    @Override
    public String toString() {
        return "Magician{" +
                "magic='" + magic + '\'' +
                '}';
    }
}

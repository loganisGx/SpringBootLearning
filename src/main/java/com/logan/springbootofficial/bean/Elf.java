package com.logan.springbootofficial.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Desc：Elf
 * Created by Logan-liugenxing on 2021/5/12 9:49.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Data //getter and setter
@NoArgsConstructor  //无惨构造
@AllArgsConstructor //全参构造
@ToString
public class Elf {
    private String name;
    private String skill;

}

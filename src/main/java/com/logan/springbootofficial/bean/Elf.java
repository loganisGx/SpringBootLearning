package com.logan.springbootofficial.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Desc：Elf
 * Created by mskj-liugenxing on 2021/5/12 9:49.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Elf {
    private String name;
    private String skill;

}

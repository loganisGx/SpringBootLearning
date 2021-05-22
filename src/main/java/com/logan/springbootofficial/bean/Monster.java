package com.logan.springbootofficial.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Desc：Monster
 * Created by mskj-liugenxing on 2021/5/12 9:09.
 * Copr：© 2021 MSKJ.All rights reserved.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Monster {
    private String name;
    private Integer attack;
    private Integer defend;

}

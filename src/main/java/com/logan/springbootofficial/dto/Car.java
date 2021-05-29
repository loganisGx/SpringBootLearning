package com.logan.springbootofficial.dto;


import lombok.Data;
import lombok.ToString;

/**
 * Desc：Car
 * Created by liugenxing on 2021/5/24 18:15.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Data
@ToString
public class Car {
    private String branch;
    private String name;
    private Integer price;

    private Maker maker;
}

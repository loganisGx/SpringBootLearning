package com.logan.springbootofficial.bean.spring;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * Desc：Logan
 * Created by liugenxing on 2021/5/23 16:39.
 * Copr：© 2021 Logan.All rights reserved.
 */
@Component
public class Logan {
    private Map<String, List<String>> typeMap;

    public void setTypeMap(Map<String, List<String>> typeMap) {
        this.typeMap = typeMap;
    }

    @Override
    public String toString() {
        return "Logan{" +
                "typeMap=" + typeMap +
                '}';
    }
}

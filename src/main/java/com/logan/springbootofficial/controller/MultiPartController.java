package com.logan.springbootofficial.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Desc：MultiPartController
 * Created by liugenxing on 2021/6/3 12:38.
 * Copr：© 2021 Logan.All rights reserved.
 */
@RestController
@Slf4j
public class MultiPartController {

    @PostMapping("/upload")
    public String uploadFile(@RequestPart("photo") MultipartFile photo){
        String originalFilename = photo.getOriginalFilename();
        long size = photo.getSize();
        String name = photo.getName();
        log.info("字段名：{}", name);
        log.info("文件名：{},文件大小：{}",originalFilename,size);

        try {
            photo.transferTo(new File("D://CODE-OUTPUT//" + photo.getOriginalFilename()));
        } catch (IOException e) {
            log.error("上传失败！",e);
        }
        return "上传成功！";
    }
}

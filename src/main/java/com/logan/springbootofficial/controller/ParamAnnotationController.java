package com.logan.springbootofficial.controller;

import com.logan.springbootofficial.dto.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Desc：ParamAnnotationController
 * Created by Logan-liugenxing on 2021/5/19 12:13.
 * Copr：© 2021 Logan.All rights reserved.
 */
@RestController
@Slf4j
public class ParamAnnotationController {

    /**
     * Desc: @PathVariable 接收路径变量
     * 表达式{a} 中的a是变量
     * Created by Logan-liugenxing on 2021/5/19 12:50
     * @param branch
     * @param id
     * @param paramMap
     * @return java.util.Map<java.lang.String, java.lang.Object>
     */
    @GetMapping("/car/{branch}/owner/{ownerId}")
    public Map<String,Object> pathVariable(@PathVariable("branch") String branch,
                                           @PathVariable("ownerId") Long id,
                                           @PathVariable Map<String,String> paramMap){
        log.info("品牌：{}",branch);
        log.info("拥有者ID：{}",id);
        log.info("参数集：{}",paramMap);
        Map<String,Object> result = new HashMap<>();
        result.put("branch",branch);
        result.put("id",id);
        result.put("paramMap",paramMap);
        return result;
    }

    /**
     * Desc: @RequestHeader 接收请求头
     * Created by Logan-liugenxing on 2021/5/19 12:51
     * @param userAgent
     * @param headers
     * @param httpHeaders
     * @return java.util.Map<java.lang.String, java.lang.Object>
     */
    @GetMapping("/headers")
    public Map<String,Object> requestHeader(@RequestHeader("User-Agent") String userAgent,
                                            @RequestHeader Map<String,String> headers,
                                            @RequestHeader HttpHeaders httpHeaders){
        log.info("User-Agent : {}", userAgent);
        log.info("headerMap : {}", headers);
        log.info("httpHeaders : {}", httpHeaders);
        Map<String,Object> result = new HashMap<>();
        result.put("User-Agent",userAgent);
        result.put("headerMap",headers);
        result.put("httpHeaders",httpHeaders);
        return result;
    }

    /**
     * Desc: @RequestParam 接收请求参数
     * MultiValueMap的实例是LinkedMultiValueMap
     * Created by Logan-liugenxing on 2021/5/19 12:49
     * @param age
     * @param cars
     * @param params 实例是LinkedMultiValueMap
     * @return java.lang.String
     */
    @GetMapping("/reqParam")
    public String requestParam(@RequestParam("age") Integer age,
                               @RequestParam("cars") List<String> cars,
                               @RequestParam MultiValueMap<String,String> params){

        log.info("age : {}", age);
        log.info("cars : {}", cars);
        log.info("params : {}", params);

        return "Hello";
    }


    /**
     * Desc: @RequestBody 接收请求体
     * Created by liugenxing on 2021/5/19 12:14
     * @param form
     * @return java.util.Map<java.lang.String, java.lang.Object>
     */
    @PostMapping("/signUp")
    public Map<String,Object> formPost(@RequestBody String form){
        Map<String,Object> result = new HashMap<>();
        result.put("form",form);
        System.out.println(result);
        return result;
    }

    @ResponseBody
    @PostMapping("/buyCar")
    public Car buyCar(Car car){
        log.info(car.toString());
        return car;
    }
}

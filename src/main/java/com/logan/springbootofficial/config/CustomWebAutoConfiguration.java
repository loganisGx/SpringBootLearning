package com.logan.springbootofficial.config;

import com.logan.springbootofficial.interceptor.HeroInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Desc：CustomWebAutoConfiguration
 * Created by liugenxing on 2021/6/2 12:38.
 * Copr：© 2021 Logan.All rights reserved.
 */
//@Configuration(proxyBeanMethods = false)
@Component
public class CustomWebAutoConfiguration implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HeroInterceptor()).
                addPathPatterns("/yasuo");
    }
}

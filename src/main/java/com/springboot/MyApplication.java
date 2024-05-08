package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@AutoConfiguration
//@EnableSwagger2
public class MyApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        try{
            SpringApplication.run(MyApplication.class);
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }
}


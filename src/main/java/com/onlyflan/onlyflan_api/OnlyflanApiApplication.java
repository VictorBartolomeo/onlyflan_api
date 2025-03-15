package com.onlyflan.onlyflan_api;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class OnlyflanApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlyflanApiApplication.class, args);
    }

    @PostConstruct
    public void init(){
        TimeZone.setDefault(TimeZone.getTimeZone("UTC+2"));
    }

}

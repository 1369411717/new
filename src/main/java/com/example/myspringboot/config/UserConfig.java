package com.example.myspringboot.config;


import com.example.myspringboot.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean("user02")
    public User getUser(){
        return new User("sdf","few");
    }
}

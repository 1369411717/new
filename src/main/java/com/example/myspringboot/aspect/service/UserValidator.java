package com.example.myspringboot.aspect.service;

import com.example.myspringboot.pojo.User;

public interface UserValidator {
    //检查对象是否为空
    public boolean validator(User user);
}

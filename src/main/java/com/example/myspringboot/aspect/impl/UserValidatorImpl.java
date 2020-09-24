package com.example.myspringboot.aspect.impl;

import com.example.myspringboot.aspect.service.UserValidator;
import com.example.myspringboot.pojo.User;

public class UserValidatorImpl implements UserValidator {
    @Override
    public boolean validator(User user) {//引入功能
        System.out.println("引入的接口功能"+UserValidator.class.getSimpleName());
        return user!=null&&user.getUserName()!=null?true:false;
    }
}

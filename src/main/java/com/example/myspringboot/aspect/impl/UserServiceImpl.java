package com.example.myspringboot.aspect.impl;

import com.example.myspringboot.aspect.service.UserService;
import com.example.myspringboot.pojo.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void printUser(User user) {
        if(user == null){
            throw new RuntimeException("用户对象错误。。。。。");
        }
        System.out.println("UserName="+user.getUserName());
        System.out.println("Password="+user.getPassword());
    }
}

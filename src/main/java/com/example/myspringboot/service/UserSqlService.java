package com.example.myspringboot.service;

import com.example.myspringboot.pojo.User;

import java.util.List;

public interface UserSqlService {
     List<User>queryAll();
     int insertUser(User user);
}

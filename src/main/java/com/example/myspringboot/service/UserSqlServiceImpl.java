package com.example.myspringboot.service;

import com.example.myspringboot.mapper.UserMapper;
import com.example.myspringboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("UserSql")
public class UserSqlServiceImpl implements UserSqlService {


    private UserMapper userMapper;

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }

    @Transactional
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }
}

package com.example.myspringboot.mapper;

import com.example.myspringboot.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {
    //@Select("select * from data")
    public List<User> queryAll();
    //@Insert("insert into data values (#{userName},#{password})")
    public int insertUser(User user);
}

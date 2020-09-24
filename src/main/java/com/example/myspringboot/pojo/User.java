package com.example.myspringboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Alias("user")//Mybatis指定别名
public class User {
    private String userName;
    private String password;
}

package com.example.myspringboot;


import com.example.myspringboot.aspect.MyAspect;


import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


import java.sql.*;

@SpringBootApplication
@EnableTransactionManagement   //开启事务
public class MyspringbootApplication {


    /*@Bean("myAspect")//Spring框架会自动收集这些bean，并添加到Spring AOP
        public MyAspect initMyAspect(){
            return new MyAspect();
        }*/

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        SpringApplication.run(MyspringbootApplication.class, args);
    }

}

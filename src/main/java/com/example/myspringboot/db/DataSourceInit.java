/*
package com.example.myspringboot.db;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.applet.AppletContext;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DataSourceInit implements ApplicationContextAware {
    ApplicationContext applicationContext=null;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        DataSource dataSource=applicationContext.getBean(DataSource.class);
        try {
            ResultSet resultSet=dataSource.getConnection().createStatement().executeQuery("SELECT * from data");
            while (resultSet.next()){System.out.println(resultSet.getString("username"));}
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
*/

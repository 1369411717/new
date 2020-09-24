package com.example.myspringboot.controller;


import com.example.myspringboot.aspect.service.UserService;
import com.example.myspringboot.aspect.service.UserValidator;
import com.example.myspringboot.mapper.UserMapper;
import com.example.myspringboot.pojo.User;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
//@SessionAttributes(names = "session")
public class IndexController{
    private User user;
    private UserService userService;

    @Autowired
    @Qualifier("user02")
    public void setUser(User user) {
        this.user = user;
    }

    @Autowired(required = false)
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/test")
    public ModelAndView index(HttpServletRequest request,
                              HttpServletResponse response){
        ModelAndView mode=new ModelAndView("test");
        request.getSession().setAttribute("session","sda");
        HttpSession session=request.getSession();
        //session.removeAttribute("session");
        //mode.addObject("session","session");
        System.out.println(user.getUserName()+"//"+user.getPassword());
        mode.addObject("user02",user);
        return mode;
    }

    @RequestMapping("/user")
    @ResponseBody
    public User printUser(String userName,String password){
        User user=new User();
        user.setPassword(password);
        user.setUserName(userName);
//        userService.printUser(user);
//        User user=null;
        UserValidator userValidator=(UserValidator)userService;
        if(userValidator.validator(user)){
            userService.printUser(user);
            System.out.println(userMapper.insertUser(user));
        }else {
            System.out.println("user==null。。。。");
        }
        return user;
    }

    @Resource
    private DataSource dataSource;

    @Resource
    private UserMapper userMapper;
    @RequestMapping("wfe")
    public ModelAndView getWef(HttpServletRequest request,HttpServletResponse response,
                               @RequestParam(value = "e",required = false) String e){
        request.setAttribute("ad","af");
                //System.out.println(request.getParameter("e"));
                ModelAndView modelAndView=new ModelAndView("wfe");
        modelAndView.addObject("user","user");
        System.out.println(dataSource.toString());
        try {
            ResultSet resultSet=dataSource.getConnection().createStatement().executeQuery("SELECT * from data");
            while (resultSet.next()){System.out.println(resultSet.getString("username"));}
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        User user=userMapper.queryAll().get(0);
        System.out.println(user.getUserName()+user.getPassword());
        return modelAndView;
    }
}

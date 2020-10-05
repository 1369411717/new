package com.example.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLSyntaxErrorException;

@Controller
//@ResponseBody
public class MyController {
    @RequestMapping("/map")
    public String map(){
        return "my/mtref";
    }
    @ResponseBody
    @RequestMapping("ajax.do")
    public Object ajax(HttpServletRequest request){
        System.out.println(request.getParameter("data").toString());
        return request.getParameter("data");
    }
}

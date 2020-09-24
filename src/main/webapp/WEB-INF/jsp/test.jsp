<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*" %>
<%@ page import="com.example.myspringboot.pojo.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
        <title>Spring Boot测试</title>
        <script type="text/javascript" src="jquery-3.3.1.min.js"></script>

    </head>

    <body>
        <h1>图形测试</h1>
        <script>
            $(document).ready(function () {
                $("#tt").html("jq test");
            });
        </script>
        <h1><% out.print(((User)request.getAttribute("user02")).getUserName()); %></h1>
        <h1><% out.print(((User)request.getAttribute("user02")).getPassword()); %></h1>
        <h1><% out.print(request.getAttribute("test")); %></h1>
        <h2 id="tt"></h2>
        <% out.print(session.getAttribute("session")); %>
    </body>
</html>
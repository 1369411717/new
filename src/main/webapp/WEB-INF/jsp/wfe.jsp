<%--
  Created by IntelliJ IDEA.
  User: 大江户时代
  Date: 2020/7/15
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="1" end="100" var="sn">
    ${sn}
</c:forEach>
${requestScope.user}
<% out.print(request.getAttribute("user")); %>
<% out.print(request.getAttribute("ad"));%>
${param.e}
</body>
</html>

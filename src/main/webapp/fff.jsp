<%--
  Created by IntelliJ IDEA.
  User: 大江户时代
  Date: 2020/9/30
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="jquery-3.3.1.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="ad">这是jsp</div>
<button onclick="ajax()">ad</button>
</body>
<script type="text/javascript">
    let data={"aa":1,"bb":2};
    function ajax() {
           $.ajax({
               url:"ajax.do",
               //此处需要告知传递参数类型为 JSON，不能缺少
               contentType:"application/json",
               data: {"data":JSON.stringify(data)},
               success:function (msg) {
                   let repose=JSON.parse(msg);
                   $("#ad").html(repose.aa+repose.bb);
               }
           });
    }
</script>
</html>

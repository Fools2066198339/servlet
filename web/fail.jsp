<%--
  Created by IntelliJ IDEA.
  User: liukui
  Date: 2021/8/27
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fail</title>
</head>
<body>
<%

    Object error = session.getAttribute("error");
    if (String.valueOf(error).equals("1")) {
        out.write("验证码错误");
    } else if (String.valueOf(error).equals("2")) {
        out.write("用户名或密码错误！");
    }

%>
</body>
</html>

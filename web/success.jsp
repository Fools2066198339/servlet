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
    <title>success</title>
</head>
<body>
<%
    Object success = session.getAttribute("success");
    out.write(String.valueOf(success));
%>
</body>
</html>

<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: liukui
  Date: 2021/8/30
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello_jsp</title>
</head>
<body>
<%
    System.out.println("hello jsp");
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String now = sdf.format(new Date());
    out.write(now);
    hello();
    response.getWriter().write("hahah");
%>
<%!
    //定义类的成员方法和成员变量

    int i = 10;

    void hello() {
        System.out.println("hello" + i);
    }
%>
</body>
</html>

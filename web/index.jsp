<%--
  Created by IntelliJ IDEA.
  User: liukui
  Date: 2021/8/26
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>test</title>
  </head>
  <body>
  hello web
  <form action="./ServletLogin"
        method="post">
      用户名:<label>
      <input type="text" name="username">
  </label><br>
      密码:<label>
      <input type="password" name="password">
  </label><br>

<%--    角色:<input type="checkbox" name="roles" value="teacher">教师--%>
<%--    <input type="checkbox" name="roles" value="manger">经理<br>--%>
    <input type="submit" value="提交">
  </form>
  </body>
</html>

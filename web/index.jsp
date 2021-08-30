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
  <form action="ServletLogin"
        method="post">
      用户名:<label>
      <input type="text" name="username">
  </label><br>
      密码:<label>
      <input type="password" name="password">
  </label><br>
      验证码:<label>
      <input type="text" name="checkCode">
      <img src="checkCodeServlet" id="checkImg" onclick="changeCheckCode()"><a
          href="#" onclick="changeCheckCode()"
          style="text-decoration:none;">看不清,
      换一张？</a>
  </label><br>

    <input type="submit" value="提交">
  </form>
  </body>
  <script>
      //点击回掉方法
      function changeCheckCode() {
          //换图片
          var img = document.getElementById("checkImg");
          var date = new Date();
          img.setAttribute("src", "checkCodeServlet?time=" + date.getTime());

      }
  </script>
</html>

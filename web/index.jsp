<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/6/10
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>添加客户</title>
  </head>
  <body>

  <form method="post" action="saveCustomer">
    客户姓名：<input type="text" name="name"><br>
    客户年龄：<input type="text" name="age"><br>
    <input type="submit" value="保存">
  </form>

  </body>
</html>

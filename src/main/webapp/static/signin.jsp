<%--
  Created by IntelliJ IDEA.
  User: k1dep
  Date: 18.07.2022
  Time: 2:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Sign in</title>
</head>
<body>
<h1><%= "Введіть логін та пароль для входу в базу" %></h1>
<br/>
<form action="servlet-1" method="post">
    <label><input type="text" name="login"></label>
    <label><input type="text" name="password"></label>
    <input type="submit" value="увійти">
</form>
</body>
</html>

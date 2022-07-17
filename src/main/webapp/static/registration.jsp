<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1><%= "Введіть логін та пароль для реєстрації" %></h1>
<br/>
<form action="servlet-1" method="post">
    <label><input type="text" name="id"></label>
    <label><input type="text" name="login"></label>
    <label><input type="text" name="password"></label>
    <input type="submit" value="додати користувача">
</form>
</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 21/11/2022
  Time: 2:05 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<h2>Calculator</h2>
<form action="/caculator/result2">
    <input type="number" name="number1" placeholder="Number 1">
    <input type="number" name="number2" placeholder="Number 2">
    <br>
    <input type="submit" name="operator" value="addition" placeholder="addition">+
    <input type="submit" name="operator" value="subtraction" placeholder="subtraction">-
    <input type="submit" name="operator" value="multiplication" placeholder="multiplication">x
    <input type="submit" name="operator" value="division" placeholder="division">/

</form>
<p>Keet qua : ${result}</p>

</body>
</html>

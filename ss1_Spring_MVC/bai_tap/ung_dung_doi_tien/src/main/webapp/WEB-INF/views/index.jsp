<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 18/11/2022
  Time: 10:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>Change Money</h2>
  <form action="/change/convert" method="post">
Nhập USD
    <input type="number" name="amount">
    Nhập Tỉ Lệ
    <input type="number" name="rate">
    <input type="submit" value="Kết quả">
  </form>
  <p>Kết quả là : ${result} vnd</p>

  </body>
</html>

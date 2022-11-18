<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 18/11/2022
  Time: 1:36 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h2>Vocabulary</h2>
<form action="/dictionary/translate" method="post">
    <p>Nhập từ điển bạn muốn đỏi</p>
    <input type="text" name="vocabulary">
    <input type="submit" value="kết quả">
</form>
<p>Từ đó có nghĩa : ${result}</p>
</body>
</html>

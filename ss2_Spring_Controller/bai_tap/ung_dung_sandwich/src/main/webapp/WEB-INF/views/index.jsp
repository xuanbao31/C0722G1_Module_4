<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 21/11/2022
  Time: 11:11 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SandWich</title>
</head>
<body>
<h1>
    Sandwich condiments
</h1>
<form action="/sandwich">
    <table>
        <tr>
            <input type="checkbox" name="a" value="Lettuce">Lettuce</input>
            <input type="checkbox" name="a" value="Tomato">Tomato</input>
            <input type="checkbox" name="a" value="Mustard">Mustard</input>
            <input type="checkbox" name="a" value="Sprouts">Sprouts</input>
        </tr>
    </table>
    <p>Nhung gia vi ma ban chon :</p>
    <c:forEach items="${food}" var="sandwich">
        <span>${sandwich}</span>
    </c:forEach>
    <pre><input type="submit" value="Save"></pre>

</form>


</body>
</html>

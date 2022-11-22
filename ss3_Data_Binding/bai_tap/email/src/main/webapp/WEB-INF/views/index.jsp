<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22/11/2022
  Time: 10:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
    <title>$Title$</title>
</head>
<body>
<form:form modelAttribute="email" action="emailUpdate" method="post">
    <table class="table table-primary">
        <tr>
            <td>Languages :</td>
            <td>
                <form:select path="languages">
                    <form:options items="${languageList}"/>
                </form:select>
            </td>
        </tr>
        <tr>
            <td>Page Size :</td>
            <td>
                Show <form:select path="pageSize">
                <form:options items="${pageSizeList}"/>
            </form:select>
            </td>
        </tr>
        <tr>
            <td>Spams Filter :</td>
            <td>
                <form:checkboxes path="spamsFilter" items="${spamsFilterList}"></form:checkboxes>
            </td>
        </tr>
        <tr>
            <td>Signature :</td>
            <td><form:textarea rows="7" cols="35" path="signature"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="update" class="button btn-primary"></td>
            <td><input type="reset" value="cancel" class="button btn-secondary"></td>

        </tr>
    </table>

</form:form>
</body>
</html>

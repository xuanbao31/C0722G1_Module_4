<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 22/11/2022
  Time: 1:42 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
</head>
<body>
<h3>${message}</h3>
<a href="/home" class="button btn-primary">Back To List</a>
<table class="table table-success">
    <tr>
        <td>Languages:</td>
        <td>${save.languages}</td>
    </tr>
    <tr>
        <td>PageSize:</td>
        <td>${save.pageSize}</td>
    </tr>
    <tr>
        <td>Spams Filter</td>
        <td>${save.spamsFilter}</td>
    </tr>
    <tr>
        <td>Signature</td>
        <td>${save.signature}</td>
    </tr>
</table>

</body>
</html>

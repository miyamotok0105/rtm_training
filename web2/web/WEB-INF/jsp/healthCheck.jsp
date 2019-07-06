<%--
  Created by IntelliJ IDEA.
  User: miyamoto
  Date: 2019/07/06
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>健康診断</title>
</head>
<body>

<form action="/healthCheck" method="post">
    身長: <input type="text" name="height">(cm)<br>
    体重: <input type="text" name="weight">(kg)<br>
    <input type="submit" value="診断">
</form>

</body>
</html>

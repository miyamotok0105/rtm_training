<%--
  Created by IntelliJ IDEA.
  User: miyamoto
  Date: 2019/07/06
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page import="Sample.model.Health" %>
<%
Health health = (Health)request.getAttribute("health");

%>

<html>
<head>
    <title>結果</title>
</head>
<body>

<h1>健康診断の結果</h1>

<p>
    身長:<%= health.getHeight() %> <br>
    体重:<%= health.getWeight() %> <br>
    BMI:<%= health.getBmi() %> <br>
    タイプ:<%= health.getBodyType() %> <br>

</p>

<a href="/healthCheck">戻る</a>

</body>
</html>

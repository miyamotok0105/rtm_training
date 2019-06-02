<%--
  Created by IntelliJ IDEA.
  User: miyamoto
  Date: 2019/06/02
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo JSP</title>
</head>

<%
//Servletはリクエストを受け取って処理。
//JSPはレスポンス処理をする

    int demovar=0;
%>

<body>
Count is:
<%
//表示されない
System.out.println("=======");
System.out.println(demovar++);
%>


<%= demovar++ %>

<body>
</html>
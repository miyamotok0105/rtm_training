<%--
  Created by IntelliJ IDEA.
  User: miyamoto
  Date: 2019/06/22
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%

String[] luckArray = {"good", "normal", "bad"};
int index = (int)(Math.random()*3);
String luck = luckArray[index];

Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
String today = sdf.format(date);

%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    Math.random()：　<%= Math.random() %>
</div>
<div>
    Math.random()*3：　<%= Math.random()*3 %>
</div>
<div>
    index：<%= index %>
</div>
<p>
    <%= today %>の運勢は<%= luck %>です。
</p>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 10559
  Date: 2020/9/24
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--使用 rest风格的url地址--%>

<a href="book/1">get方式查询图书</a>
<a href="book/1">delete方式删除图书</a>
<a href="book/1">put方式更新图书</a>
<form action="book" method="post">
    <input type="submit" value="post方式添加图书">
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: zhengfan
  Date: 2020/9/25
  Time: 上午1:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
成功！！！

pageContext:${pageScope.msg}<br/>
request:${requestScope.msg}<br/>
session:${sessionScope.msg}<br/>
application:${applicationScope.msg}<br/>
</body>
</html>

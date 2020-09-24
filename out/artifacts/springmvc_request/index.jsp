<%--
  Created by IntelliJ IDEA.
  User: zhengfan
  Date: 2020/9/25
  Time: 上午12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试请求参数</title>
</head>
<body>
<a href="handle?username=tomcat">默认情况下请求参数获取</a><br/>
<a href="handle2?user=tomcat">使用requestParam请求参数获取</a><br/>
<a href="handle3">获取请求头的值</a><br/>
<a href="handle4">获取cookie的值</a>

<form action="book" method="post">
   书名 <input type="text" name="bookName"><br/>
   作者 <input type="text" name="author"><br/>
   价格 <input type="text" name="price"><br/>
   库存 <input type="text" name="stock"><br/>
   销量 <input type="text" name="sales"><br/>
    省 <input type="text" name="address.province"><br/>
    市 <input type="text" name="address.city"><br/>
    区 <input type="text" name="address.street"><br/>
    <input type="submit" value="提交">
</form>

<a href="req">测试原生api使用</a>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: 10559
  Date: 2020/9/24
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
首页
<a href="hello">helloworld</a>
<h1>测试RequestMappingController的方法</h1>
<a href="haha/handle01">标注在类上的requestMapping</a>
<%--标注在类上的requestMapping的method 指定参数--%>
<h1>测试RequestMappingController的method</h1>
<form action="haha/handle02" method="post">
    <input type="submit" value="提交">
</form>
<a href="haha/handle03">标注在类上的requestMapping的 params</a><br/>
<a href="haha/handle04">标注在类上的requestMapping的 headers</a>

<h1>测试ant风格的模糊匹配</h1>
<a href="antTest01">精确匹配</a><br/>

<a href="user/admin">测试路径占位符</a>
</body>
</html>

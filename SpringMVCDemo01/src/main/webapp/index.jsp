<%--
  Created by IntelliJ IDEA.
  User: ZSAndroid
  Date: 2022/7/8
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href=${pageContext.request.contextPath}/demo.action>访问Tomcat服务器</a>
<form action="${pageContext.request.contextPath}/request.action" method="post">
    <input type="submit" value="post提交">
</form>
<form action="${pageContext.request.contextPath}/request.action" method="get" >
    <input type="submit" value="get提交">
</form>
</body>
</html>

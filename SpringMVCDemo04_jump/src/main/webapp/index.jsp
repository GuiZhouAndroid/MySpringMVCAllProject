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
    <title>SpringMVC四种跳转方式</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/one.do">1.请求转发页面(默认)</a><br><br>
<a href="${pageContext.request.contextPath}/two.do">2.请求转发do</a><br><br>
<a href="${pageContext.request.contextPath}/three.do">3.重定向页面</a><br><br>
<a href="${pageContext.request.contextPath}/four.do">4.重定向do</a><br><br>
<a href="${pageContext.request.contextPath}/five.do">5.随便跳页面</a><br><br>
</body>
</html>

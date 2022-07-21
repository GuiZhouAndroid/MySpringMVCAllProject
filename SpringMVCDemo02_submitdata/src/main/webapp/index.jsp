<%--
  Created by IntelliJ IDEA.
  User: ZSAndroid
  Date: 2022/7/20
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>五种参数绑定方式</title>
</head>
<body>
<h3>1.单个数据提交</h3>
<form action="${pageContext.request.contextPath}/one.do" method="post">
    姓名：<input type="text" name="myname"><br/>
    年龄：<input type="text" name="myage"><br/>
    <input type="submit" value="单个数据提交">
</form>
<br/>
<h3>2.对象封装注入</h3>
<form action="${pageContext.request.contextPath}/two.do" method="post">
    <%-- 对象属性名称与输入框name属性值必须保持一致 --%>
    <%-- private String name; --%>
    <%-- private int age; --%>
    姓名：<input type="text" name="name"><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="对象封装注入">
</form>
<br/>
<h3>3.动态占位符注入</h3>
<a href="${pageContext.request.contextPath}/three/张松/24.do">动态占位符注入</a>
<br/>
<h3>4.映射名称不一致</h3>
<form action="${pageContext.request.contextPath}/four.do" method="post">
    <%-- String name, int age --%>
    姓名：<input type="text" name="myname"><br/>
    年龄：<input type="text" name="myage"><br/>
    <input type="submit" value="映射名称不一致">
</form>
<br/>
<h3>5.HttpServletRequest手工提取</h3>
<form action="${pageContext.request.contextPath}/five.do" method="post">
    <%-- String name, int age --%>
    姓名：<input type="text" name="myname"><br/>
    年龄：<input type="text" name="myage"><br/>
    <input type="submit" value="HttpServletRequest手工提取">
</form>
</body>
</html>

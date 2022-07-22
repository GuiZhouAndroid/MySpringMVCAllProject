<%--
  Created by IntelliJ IDEA.
  User: ZSAndroid
  Date: 2022/7/8
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>main...显示数据</h2>
<%--
        request.setAttribute("requestUser",u);
        session.setAttribute("sessionUser",u);
        model.addAttribute("modelUser",u);
        map.put("mapUser",u);
        modelMap.addAttribute("modelMapUser",u);
--%>
requestUsers:${requestUser}<br>
sessionUsers:${sessionUser}<br>
modelUsers:${modelUser}<br>
mapUsers:${mapUser}<br>
modelMapUsers:${modelMapUser}<br>
从index.jsp页超链接获取的姓名${param.name}
从index.jsp页超链接获取的年龄${param.age}
</body>
</html>

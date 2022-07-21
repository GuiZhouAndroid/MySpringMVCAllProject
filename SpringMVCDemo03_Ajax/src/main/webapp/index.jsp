<%--
  Created by IntelliJ IDEA.
  User: ZSAndroid
  Date: 2022/7/21
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js"></script>
<body>
<button onclick="getlist()">点击获取学生集合</button>
<div id="list">正在请求数据...</div>
<script type="text/javascript">
    $.ajax({
        url: '${pageContext.request.contextPath}/list.do',
        dataType: 'json',
        success: function (result) {
            let s = "";
            $.each(result, function (item, stu) {
                s += stu.name + "----" + stu.age + "</br>"
            })
            $("#list").html(s);
        }
    })
</script>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>中转中心业务员主页</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/bill/fromBill">中转中心出发单</a>
    <br>
    <a href="<%=request.getContextPath()%>/bill/toBill">中转中心到达单</a>
    <br>
    <a href="<%=request.getContextPath()%>/logout">登出</a>
</nav>
<table>
    <tr>
        <td>姓名</td>
        <td>${employee.name}</td>
    </tr>
    <tr>
        <td>id</td>
        <td>${employee.id}</td>
    </tr>
    <tr>
        <td>职务类型</td>
        <td>${employee.positionType}</td>
    </tr>
    <tr>
        <td>所属部门</td>
        <td>${employee.hallId}</td>
    </tr>
</table>
</body>
</html>

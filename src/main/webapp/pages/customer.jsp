<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>客户主页</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/logout">登出</a>
</nav>
<h1>基本信息</h1>
<table>
    <tr>
        <td>姓名</td>
        <td>${customer.name}</td>
    </tr>
    <tr>
        <td>id</td>
        <td>${customer.id}</td>
    </tr>
    <tr>
        <td>性别</td>
        <td>${customer.gender}</td>
    </tr>
    <tr>
        <td>地址</td>
        <td>${customer.location}</td>
    </tr>
    <tr>
        <td>最近营业厅</td>
        <td>${customer.hallId}</td>
    </tr>
</table>
<h1>所有订单</h1>
<table>
    <tr>
        <td>订单号</td>
        <td>日期</td>
        <td>起点</td>
        <td>终点</td>
        <td>详细终点地址</td>
        <td>重量</td>
        <td>物品大类</td>
        <td>物品小类</td>
        <td>运输方式</td>
        <td>金额</td>
        <td>接手快递员id</td>
        <td>进度</td>
    </tr>
    <c:forEach items="${billList}" var="item">
        <tr>
            <td>${item.id}</td>
            <td>${item.date}</td>
            <td>${item.from_hall}</td>
            <td>${item.to_hall}</td>
            <td>${item.location}</td>
            <td>${item.weight}</td>
            <td>${item.bigType}</td>
            <td>${item.smallType}</td>
            <td>${item.transType}</td>
            <td>${item.money}</td>
            <td>${item.employeeId}</td>
            <td>${item.progress}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增揽件单</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/employee/home">员工首页</a>
</nav>
<form action="<%=request.getContextPath()%>/bill/startBill" method="POST">
    <table>
        <tr>
            <td>客户id</td>
            <td><input type="text" name="customerId"/></td>
        </tr>
        <tr>
            <td>起点营业厅</td>
            <td><input type="text" name="from_hall"/></td>
        </tr>
        <tr>
            <td>终点营业厅</td>
            <td><input type="text" name="to_hall"/></td>
        </tr>
        <tr>
            <td>详细地址</td>
            <td><input type="text" name="location"/></td>
        </tr>
        <tr>
            <td>重量</td>
            <td><input type="text" name="weight"/></td>
        </tr>
        <tr>
            <td>物品大类</td>
            <td><input type="text" name="bigType"/></td>
        </tr>
        <tr>
            <td>物品小类</td>
            <td><input type="text" name="smallType"/></td>
        </tr>
        <tr>
            <td>金额</td>
            <td><input type="text" name="money"/></td>
        </tr>
        <tr>
            <td>运输方式</td>
            <td><input type="text" name="transType"/></td>
        </tr>
    </table>
    <input type="submit" value="添加">
</form>
</body>
</html>

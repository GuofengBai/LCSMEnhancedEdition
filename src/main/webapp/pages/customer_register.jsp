<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户注册</title>
</head>
<body>
<h1>客户注册</h1>
<form action="<%=request.getContextPath()%>/customer/register" method="POST">
    <table>
        <tr>
            <td>id</td>
            <td><input type="text" name="id"/></td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><input type="text" name="name"/></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" name="gender"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>地址</td>
            <td><input type="text" name="location"/></td>
        </tr>
        <tr>
            <td>最近营业厅</td>
            <td><input type="text" name="hallId"/></td>
        </tr>
    </table>
    <input type="submit" value="注册">
</form>
<a href="<%=request.getContextPath()%>/login">去登陆</a>
</body>
</html>

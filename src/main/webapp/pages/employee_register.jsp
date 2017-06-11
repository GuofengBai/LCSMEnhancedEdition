<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工注册</title>
</head>
<body>
<h1>员工注册</h1>
<form action="<%=request.getContextPath()%>/employee/register" method="POST">
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
            <td>密码</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td>岗位类型</td>
            <td><input type="text" name="positionType"/></td>
        </tr>
        <tr>
            <td>部门名称</td>
            <td><input type="text" name="hallId"/></td>
        </tr>
    </table>
    <input type="submit" value="注册">
</form>
<a href="<%=request.getContextPath()%>/login">去登陆</a>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>到达单</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/employee/home">员工首页</a>
</nav>
<form action="<%=request.getContextPath()%>/bill/toBill" method="POST">
    <table>
        <tr>
            <td>对应运输单编号</td>
            <td><input type="text" name="transBillId"/></td>
        </tr>
    </table>
    <input type="submit" value="添加">
</form>
</body>
</html>

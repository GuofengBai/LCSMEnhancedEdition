<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 19:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>派件单</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/employee/home">员工首页</a>
</nav>
<form action="<%=request.getContextPath()%>/bill/dispatchBill" method="POST">
    <table>
        <tr>
            <td>订单编号</td>
            <td><input type="text" name="startBillId"/></td>
        </tr>
    </table>
    <input type="submit" value="添加">
</form>
</body>
</html>

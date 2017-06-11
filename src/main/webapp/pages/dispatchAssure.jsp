<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>确认派件成功</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/employee/home">员工首页</a>
</nav>
<form action="<%=request.getContextPath()%>/bill/dispatchAssure" method="POST">
    <table>
        <tr>
            <td>派件单编号</td>
            <td><input type="text" name="dispatchBillId"/></td>
        </tr>
    </table>
    <input type="submit" value="确认">
</form>
</body>
</html>

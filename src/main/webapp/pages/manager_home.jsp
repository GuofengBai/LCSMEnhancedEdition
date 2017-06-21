<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/21
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>总经理首页</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/manager/s_cus_dim">订单顾客维分析</a>
    <br>
    <a href="<%=request.getContextPath()%>/manager/s_hall_dim">订单地区维分析</a>
    <br>
    <a href="<%=request.getContextPath()%>/manager/s_time_dim">订单时间维分析</a>
    <br>
    <a href="<%=request.getContextPath()%>/manager/s_product_dim">订单产品维分析</a>
    <br>
    <a href="<%=request.getContextPath()%>/manager/t_hall_dim">运输单地区维分析</a>
</nav>
</body>
</html>

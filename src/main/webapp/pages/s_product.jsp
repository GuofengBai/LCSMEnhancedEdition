<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/21
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>订单产品维分析</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/manager/home">经理首页</a>
</nav>
<br>
<iframe id="reportFrame" width="100%" height="100%"
        src="<%=request.getContextPath()%>/ReportServer?reportlet=s_product_dim.cpt&op=view"></iframe>
</body>
</html>

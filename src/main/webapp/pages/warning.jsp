<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/3/13
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
</head>
<body style="text-align: center">
<h1>${description}</h1>
<a href="<%=request.getContextPath()%>${link}">${linkText}</a>
</body>
</html>

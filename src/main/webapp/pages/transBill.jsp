<%--
  Created by IntelliJ IDEA.
  User: baiguofeng
  Date: 2017/6/11
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>运输单</title>
</head>
<body>
<nav>
    <a href="<%=request.getContextPath()%>/employee/home">员工首页</a>
</nav>
<table>
    <tr>
        <td>起始营业厅</td>
        <td>
            <input type="text" id="from_hall">
        </td>
    </tr>
    <tr>
        <td>终点营业厅</td>
        <td>
            <input type="text" id="to_hall">
        </td>
    </tr>
    <tr>
        <td>花费金额</td>
        <td>
            <input type="text" id="money">
        </td>
    </tr>
    <tr>
        <td>运输方式</td>
        <td>
            <input type="text" id="transType">
        </td>
    </tr>
    <tr>
        <td>距离</td>
        <td>
            <input type="text" id="distance">
        </td>
    </tr>
</table>
<h1>输入订单号</h1>
<table>
    <tr>
        <td>
            <input type="text" id="billId">
        </td>
        <td>
            <button id="add_bill">输入</button>
        </td>
    </tr>
</table>
<table border="2" id="bills">
    <tr>
        <td>订单号</td>
    </tr>
</table>
<button id="submit">提交</button>
<script src="${pageContext.request.contextPath}/static/js/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        var list = "";
        $('#add_bill').bind("click", function () {
            list = list + "," + $('#billId').val();
            $('#bills').append("<tr><td>" + $('#billId').val() + "</td></tr>");
            $('#bills').val("");
        });

        $('#submit').bind("click", function () {
            list = list.substr(1);
            tosend = {
                array: list,
                from_hall: $('#from_hall').val(),
                to_hall: $('#to_hall').val(),
                money: $('#money').val(),
                transType: $('#transType').val()
            };
            $.ajax("<%=request.getContextPath()%>/bill/transBill", {
                type: 'POST',
                data: tosend,
                datatype: "text",
                success: function (result) {
                    alert("新增运输单成功，单号为：" + result);
                    location.reload(true);
                },
                error: function (result) {
                    location.reload(true);
                }
            });
        });

    });
</script>
</body>
</html>

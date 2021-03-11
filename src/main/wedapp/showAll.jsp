
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <h3>学生信息展示页面</h3>
        <table border="1" width="600px">
        <tr>
            <td>学生编号</td>
            <td>学生姓名</td>
            <td>学生性别</td>
            <td>学生年龄</td>
            <td>学生操作</td>
        </tr>
        <c:forEach items="${list}" var="a">
            <tr>
                <td>${a.id}</td>
                <td>${a.name}</td>
                <td>${a.gender}</td>
                <td>${a.age}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/student/removeById?id=${a.id}">删除</a>
                    <a href="${pageContext.request.contextPath}/student/queryById?id=${a.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <a href="/add.jsp">添加学生信息</a>
</center>
</body>
</html>
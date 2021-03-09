<%--
  Created by IntelliJ IDEA.
  User: momochan
  Date: 2021/3/8
  Time: 1:36 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <center>
        <h3>学生信息修改页面</h3>
        <form action="${pageContext.request.contextPath}/student/changeStudent">
            学生姓名:<input type="text" name = "name" value ="${student.name}"><br>
            <input type="hidden" name="id" value=""${student.id}>
            学生年龄:<input type="text" name = "age" value = "${student.age}"><br>
            学生性别:<input type="radio" name = "gender" value = "男"
                        <c:if test = "${student.gender=='男'}">checked = "checked"</c:if>
                     >男
                    <input type="radio" name="gender" value="女"
                           <c:if test = "${student.gender=='女'}">checked = "checked"</c:if>
                    >女
            <br>
            <input type="submit" value="修改">
        </form>
    </center>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Ablazzing
  Date: 18.05.2021
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <H1>What' your name?</H1>
    <br>
    <form:form action="showDetail" modelAttribute="employee">
        Name <form:input path="name"/>
        Surname <form:input path="surname"/>
        Salary <form:input path="salary"/>
        <input type="submit">
    </form:form>


</body>
</html>

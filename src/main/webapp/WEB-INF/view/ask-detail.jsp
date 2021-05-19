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
        Name <form:input path="name"/> <form:errors path="name"/>
        <br/>
        Surname <form:input path="surname"/><form:errors path="surname"/><br/>
        Phone <form:input path="phone"/><form:errors path="phone"/><br/>
        Salary <form:input path="salary"/><form:errors path="salary"/><br/>
        Department <form:select path="department">
                    <form:options items="${employee.mapDepartments}"/>
                    </form:select> <br/>
        Car brand <form:radiobuttons path="carBrand" items="${employee.mapCars}" />
        <br>
        Languages <form:checkboxes path="languages" items="${employee.mapLanguages}"/>
        <input type="submit">
    </form:form>


</body>
</html>

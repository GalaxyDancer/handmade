<%@ page import="by.gal.handmade.constant.HttpSessionParameterName" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Список ремесленников</title>
</head>
<body>
<% if (session.getAttribute(HttpSessionParameterName.USER_ID) == null) { %>
<a href="http://localhost:8080/Home?command=LOGIN">Войти</a>
<% } else {%>
<a href="http://localhost:8080/Home?command=LOGOUT">Выйти</a>
<% } %>
<br>
Ремесленники:
<table>
    <c:forEach items="${models}" var="model">
        <tr>
            <td><c:out value="${model.name}" /></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

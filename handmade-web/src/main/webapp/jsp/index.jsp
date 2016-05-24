<%@ page import="by.gal.handmade.constant.HttpSessionParameterName" %><%--
  Created by IntelliJ IDEA.
  User: den
  Date: 11.05.16
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Главная</title>
  </head>
  <body>
  <% if (session.getAttribute(HttpSessionParameterName.USER_ID) == null) { %>
    <a href="http://localhost:8080/Home?command=LOGIN">Войти</a>
  <% } else {%>
    <a href="http://localhost:8080/Home?command=LOGOUT">Выйти</a>
  <% } %>
  <p>
    Главная страница
  </p>
  <a href="http://localhost:8080/Home?command=ARTISANS_LIST">Список</a>
  </body>
</html>

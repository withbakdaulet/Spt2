<%@ page import="Classes.Users" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<%@include file="vendor/navBar.jsp"%>
<div class="container mt-3">
  <div style="text-align: center; padding-top: 30px">
    <%
      Users user = (Users) request.getSession().getAttribute("current");
    %>
    <h2>Hello  <%=user.getFullName()%></h2>
    <p>Welcome to your profile page</p>
  </div>
</div>
</body>
</html>

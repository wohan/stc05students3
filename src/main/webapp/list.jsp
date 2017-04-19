<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 19.04.2017
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
    <h1>LIST STUDENTS</h1>
    <h2>
        <% String message = (String) request.getAttribute("studentHello"); %>
        <%=request.getAttribute("studentHello")%>
        <br/>
        <%=message%>
    </h2>
</body>
</html>

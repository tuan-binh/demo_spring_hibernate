<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 8/15/2025
  Time: 9:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/add" method="post">
  <input type="text" placeholder="username..." name="username">
  <input type="text" placeholder="password..." name="password">
  <button>Save</button>
</form>
</body>
</html>

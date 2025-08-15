<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 8/15/2025
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/init">Form thêm mới</a>
<table>
  <thead>
  <tr>
    <th>STT</th>
    <th>username</th>
    <th>password</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach items="${users}" var="u" varStatus="loop">
    <tr>
      <td>${loop.count}</td>
      <td>${u.username}</td>
      <td>${u.password}</td>
    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>

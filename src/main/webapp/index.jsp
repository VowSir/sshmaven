<%--
  User: ming
  Date: 2018/3/19
  Time: 23:18
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>maventest</title>
</head>
<body>
hello  maven!
<c:forEach var="i" items="${list}">
    ${i.uuid}
    ${i.name}
    ${i.tele}<br>
hello maven
</c:forEach>
</body>
</html>

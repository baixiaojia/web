<%@ page import="com.fz.Test" %>
<%@ page language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="zh-Cn">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>javaweb</title>
    <link rel="stylesheet" href="css/index.css">
</head>
<body>
<%
    Test t = new Test();
    out.print(t.getPf(9));
%>
<hr>
<h3>2*3=${2*3}</h3>
<hr>
<%
    out.print("Hello javaweb");
%>
<hr>
<c:forEach begin="1" end="10" var="i">
    ${i}<br>
</c:forEach>
<hr>
<a href="show.action">show-servlet</a>
</body>
</html>
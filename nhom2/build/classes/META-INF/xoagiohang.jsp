<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="bean.giohangbean" %>
<%@ page import="bo.giohangbo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	giohangbo gh = new giohangbo();
gh=(giohangbo) session.getAttribute("gh");
gh.XoaHet();
session.setAttribute("gh", gh);
	response.sendRedirect("htgio.jsp");
%>
</body>
</html>
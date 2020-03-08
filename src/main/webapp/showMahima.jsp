<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.mahima.web.model.Mahima" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
	<%
		Mahima m1=(Mahima)request.getAttribute("Mahima");
	out.println(m1);
			
	%>
	</body>
</html>
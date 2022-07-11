<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	Question question = (Question) session.getAttribute("currentQs");
%>

<h3>Q. <%= question.getQuestion() %></h3>

</body>
</html>
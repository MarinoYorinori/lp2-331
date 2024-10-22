<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	
	<%
		Random ran = new Random();
		int num1 = ran.nextInt(5) + 1;
		int num2 = ran.nextInt(5) + 1;
		
		out.print(num1 + " " + num2);
		
		if((num1 + num2) == 7){
			out.print("<h1>Parabéns!!! Vc ganhou<h1>");
		} else {
			out.print("<h1>Perdeu! Tente novamente<h1>");
		}
	%>
</body>
</html>
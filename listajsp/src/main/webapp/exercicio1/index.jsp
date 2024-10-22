<%@ page import="static java.lang.Integer.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Dia: </td>
			<td><input type="text" name="dia"/> </td>
		</tr>
		<tr>
			<td>Mês: </td>
			<td><input type="text" name="mes"/> </td>
		</tr>
		<tr>
			<td>Ano: </td>
			<td><input type="text" name="ano"/> </td>
		</tr>
		<tr>
			<td><input type="submit" value="Enviar"/> </td>
		</tr>
	</table>
	
	<%
		String dia = request.getParameter("dia");
	%>
</body>
</html>
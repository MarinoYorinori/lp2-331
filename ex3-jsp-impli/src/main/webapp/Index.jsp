<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="produto.Produto" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Loja</title>
</head>
<body>
	<%
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		produtos.add(new Produto("Miojo Turma da Mônica","Sabor tomate", 2.99, "miojo.webp"));
	
		ArrayList<Produto> carrinho = new ArrayList<Produto>();
	%>
	
	<h1>Loja</h1>
	<button>Carrinho</button>
	<table border="">
		<tr>
			<th> Nome </th>
			<th> Descrição </th>
			<th> Preço </th>
			<th> Imagem </th>
		</tr>
		<% for(Produto p : produtos){ %>
			<tr> 
				<td> <%out.print(p.getNome());%> </td>
				<td> <%out.print(p.getDescricao());%> </td>
				<td> <%out.print(p.getPreco());%> </td>
				<td> <img src="img/<%= p.getImg() %>" alt="<%out.print(p.getImg());%>"> </td>
				<td><button>Adicionar ao carrinho</button></td>
			</tr>
		<% } %>
	</table>

</body>
</html>
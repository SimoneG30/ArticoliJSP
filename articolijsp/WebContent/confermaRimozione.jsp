<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>

<%@page import="it.articoli.model.Articolo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet"></link>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<style>
body {
	background: #EECDA3;
	background: -webkit-linear-gradient(to top, #EF629F, #28BAE8);
	background: linear-gradient(to top, #EF629F, #28BAE8);
	height: 100%;
}

* {
	margin: 0;
}

html, body {
	height: 100%;
}

#container {
	min-height: 100%;
	height: auto !important;
	height: 100%;
	margin: 0;
}

.container {
	max-width: 550px;
}

.list-unstyled li {
	font-size: 13px;
	padding: 4px 0 0;
	color: red;
}

table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 10px;
}

.center {
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body
	style="font-family: Segoe UI, Frutiger, Frutiger Linotype, Dejavu Sans, Helvetica Neue, Arial, sans-serif;">
		<a href="javascript:history.back()" class="btn btn-light"  role="button" aria-pressed="true"  style="float: right;margin-top:20px;margin-right:20px">Torna indietro</a>
	
	<h1 style="color: red; text-align: center; padding-top: 50px">Attenzione!
		questa azione non può essere annullata</h1>
	<h3 style="text-align: center; padding-top: 50px">Sei sicuro di
		voler elminare questo articolo?</h3>
	<div class="container">

		<br>
		<div class="d-flex align-items-center justify-content-center"
			style="margin-top: 50px">



			<br>
			<%
			Articolo articoloDaRimuovereInPagina = (Articolo) request.getAttribute("articoloDaEliminare");
			%>
			<table class="table table-bordered">
				<thead class="thead-light">
					<tr>
						<th scope="col">Marca</th>
						<th scope="col">Modello</th>
						<th scope="col">Prezzo</th>
						<th scope="col">Categoria</th>
						<th scope="col">Descrizione</th>
					</tr>
				</thead>
				<tbody>
					<tr class="table-light">
						<td><%=articoloDaRimuovereInPagina.getMarca()%></td>
						<td><%=articoloDaRimuovereInPagina.getModello()%></td>
						<td><%=articoloDaRimuovereInPagina.getPrezzo()%></td>
						<td><%=articoloDaRimuovereInPagina.getCategoria()%></td>
						<td><%=articoloDaRimuovereInPagina.getDescrizione()%></td>
					</tr>
				</tbody>
			</table>
		</div>
			<div>
			<form role="form" action="RimozioneServlet" method="post">
					<div class="form-group">
						<input class="form-control" name="idArticoloRimozione" id="idArticolo"
							placeholder="ID ARTICOLO" type="hidden"
							value="<%=articoloDaRimuovereInPagina.getIdArticolo()%>" />
				</div>
				<div class="text-center">
					<input type="submit" class="btn btn-danger" value='Conferma'>
					<br>
					<br>
					<a href="searchArticolo.jsp" class="btn btn-primary" role="button" aria-pressed="true">Annulla</a>
					</div>
			</form>
			</div>
	</div>
</body>
</html>
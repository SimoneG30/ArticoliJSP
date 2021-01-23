<%@page import="java.util.List"%>
<%@page import="it.articoli.model.Articolo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina dei risultati</title>
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
</style>
</head>
<body
	style="font-family: Segoe UI, Frutiger, Frutiger Linotype, Dejavu Sans, Helvetica Neue, Arial, sans-serif;">
	<div class="container" style="max-width: 540px">
		<div class="d-flex align-items-center justify-content-center"
			style="margin-top: 50px">
			<table class="table table-bordered">
				<thead class="thead-light">
					<tr>
						<th scope="col">Marca</th>
						<th scope="col">Modello</th>
						<th scope="col" style="text-align: center">Azioni</th>
					</tr>
				</thead>
				<tbody>
					<%
					List<Articolo> listaDaServlet = (List<Articolo>) request.getAttribute("listaArticoliAttribute");
					for (Articolo articoloItem : listaDaServlet) {
					%>
					<tr class="table-light">
						<td><%=articoloItem.getMarca()%></td>
						<td><%=articoloItem.getModello()%></td>
						<td style="text-align: center"><a
							href="VisualizzaDettaglioServlet?idDaInviareComeParametro=<%=articoloItem.getIdArticolo()%>">Dettaglio</a>
							<a
							href="PreparaModificaServlet?idDaInviareComeParametro=<%=articoloItem.getIdArticolo()%>">Modifica</a>
							<a
							href="PreparaRimozioneServlet?idDaInviareComeParametro=<%=articoloItem.getIdArticolo()%>">Rimuovi</a>
						</td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>

		</div>
		<a href="PreparaAggiuntaServlet">Nuovo Articolo</a>

	</div>
</body>
</html>
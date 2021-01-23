<%@page import="java.util.List"%>
<%@page import="it.articoli.model.Articolo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina dei risultati</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body
	style="background-color:lightblue; font-family: Segoe UI, Frutiger, Frutiger Linotype, Dejavu Sans, Helvetica Neue, Arial, sans-serif;">
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
						<td><a
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
	</div>
	<br>
	<a href="PreparaAggiuntaServlet">Nuovo Articolo</a>
	</td>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>
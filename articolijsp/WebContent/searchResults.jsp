<%@page import="java.util.List"%>
<%@page import="it.articoli.model.Articolo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina dei risultati</title>
<style type="text/css">
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
<center>
	<body
		style="background-color: lightblue; font-family: Segoe UI, Frutiger, Frutiger Linotype, Dejavu Sans, Helvetica Neue, Arial, sans-serif;">
		<table class="center">
			<thead>
				<tr>
					<th>Marca</th>
					<th>Modello</th>
					<th>Azione</th>
				</tr>
			</thead>

			<%
			List<Articolo> listaDaServlet = (List<Articolo>) request.getAttribute("listaArticoliAttribute");
			for (Articolo articoloItem : listaDaServlet) {
			%>
			<tr>
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

		</table>
		<br>
		<a href="PreparaAggiuntaServlet">Nuovo abitante</a>
		</td>
</center>
</body>
</html>
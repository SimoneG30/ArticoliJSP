<%@page import="it.articoli.model.Articolo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inserimento modifiche articolo</title>
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
	<%
	if (request.getAttribute("messaggioDiErrore") != null) {
	%>
	<p style="color: red;"><%=request.getAttribute("messaggioDiErrore")%></p>
	<%
	}
	%>
	<%
	Articolo articoloInPagina = (Articolo) request.getAttribute("articoloAttributeModifica");
	%>

	<div class="container mt-5">
		<div class="card">
			<h5 class="card-header text-center">Inserire i dati da
				modificare</h5>
			<div class="card-body">
				<form role="form" action="ModificaServlet" method="post">

					<div class="form-group">
						<label>Marca</label> <input class="form-control" id="marcaInput"
							name="marcaInput" placeholder="Marca" type="text"
							value="<%=articoloInPagina.getMarca()%>" />
					</div>

					<div class="form-group">
						<label>Modello</label> <input class="form-control"
							name="modelloInput" id="modelloInput" placeholder="Modello"
							type="text" value="<%=articoloInPagina.getModello()%>" />
					</div>

					<div class="form-group">
						<label>Prezzo</label> <input class="form-control" id="prezzoInput"
							name="prezzoInput" placeholder="Prezzo" type="text"
							value="<%=articoloInPagina.getPrezzo()%>" />
					</div>

					<div class="form-group">
						<label>Categoria</label> <input class="form-control"
							name="categoriaInput" id="categoriaInput" placeholder="Categoria"
							type="text" value="<%=articoloInPagina.getCategoria()%>" />
					</div>

					<div class="form-group">
						<label>Descrizione</label> <input class="form-control"
							name="descrizioneInput" id="descrizioneInput"
							placeholder="Descrizione" type="text"
							value="<%=articoloInPagina.getDescrizione()%>" />
					</div>

					<div class="form-group">
						<input class="form-control" name="idArticolo" id="idArticolo"
							placeholder="ID ARTICOLO" type="hidden"
							value="<%=articoloInPagina.getIdArticolo()%>" />
					</div>

					<div class="form-group">
						<input type="submit" class="btn btn-primary" value='Conferma'>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
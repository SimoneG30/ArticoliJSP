<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca abitante</title>
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
	<div class="container">
		<div class="d-flex align-items-center justify-content-center"
			style="margin-top: 50px">
			<h3>Inserire i dati da ricercare</h3>
			<br>
		</div>
		<div class="d-flex align-items-center justify-content-center"
			style="height: 350px">
			<form action="SearchServlet" method="post">
				<div class="mb-3">
					<label for="marcaInput" class="form-label"><b>Marca</b></label> <input
						type="text" name="marcaInput" class="form-control" id="marcaInput">
				</div>
				<div class="mb-3">
					<label for="modelloInput" class="form-label"><b>Modello</b></label>
					<input type="text" name="modelloInput" class="form-control"
						id="modelloInput">
				</div>
				<input type="submit" class="btn btn-primary" value='Cerca'>
			</form>
		</div>
	</div>
	<!-- 	<a href="PreparaAggiuntaServlet">Nuovo articolo</a> -->


</body>
</html>
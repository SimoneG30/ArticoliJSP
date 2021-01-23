<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ricerca abitante</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

</head>
<body style = "background-color:lightblue; font-family: Segoe UI,Frutiger,Frutiger Linotype,Dejavu Sans,Helvetica Neue,Arial,sans-serif;">


<div class="container">
<div class="d-flex align-items-center justify-content-center" style="margin-top: 50px">
		<h3>Inserire i dati da ricercare</h3>
		<br>
</div>
<div class="d-flex align-items-center justify-content-center" style="height: 350px"><form>

  <div class="mb-3">
    <label for="descrizioneInput" class="form-label"><b>Descrizione</b></label>
    <input type="text" class="form-control" id="descrizioneInput" aria-describedby="descrizioneHelp">
  </div>
  <div class="mb-3">
    <label for="marcaInput" class="form-label"><b>Marca</b></label>
    <input type="text" class="form-control" id="marcaInput">
  </div>
  
  <button type="submit" class="btn btn-primary">Cerca</button>
</form>
</div>
</div>
<!-- 	<a href="PreparaAggiuntaServlet">Nuovo abitante</a> -->

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; UTF-8">
	<c:import url="../fragments/css.jsp"/>
	<title>Ajouter compte</title>
</head>
<body>
	<c:import url="../fragments/header.jsp"/>
	<div class="container">
		<h2>Ajouter une filière</h2>
		<br><br><br><br>
		<spring:url value="/filiere/add" var="formUrl"/>
		<form:form action="${formUrl}" method="POST" modelAttribute="filiere" cssClass="form-horizontal">
		<div class="form-group">
		  <label class="control-label col-sm-2" for="email">Filière:</label>
		  <div class="col-sm-10">
		    <form:input path="libelle" cssClass="form-control" placeholder="Nom de la filière"/>
		  </div>
		</div>
		<div class="form-group">        
		    <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-default">Envoyer</button>
		    </div>
		</div>
		</form:form>
	</div>
	<c:import url="../fragments/js.jsp"/>
</body>

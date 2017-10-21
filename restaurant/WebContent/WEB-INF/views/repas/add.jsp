<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; UTF-8">
	<c:import url="../fragments/css.jsp"/>
	<title>Ajouter un repas</title>
</head>
<body>
	<c:import url="../fragments/header.jsp"/>
	<div class="container">
		<h2>Ajouter un repas</h2>
		<br><br><br><br>
		<spring:url value="/repas/add" var="formUrl"/>
		<form:form action="${formUrl}" method="POST" modelAttribute="repas" cssClass="form-horizontal">
		<form:input type="hidden" path="id"/>
		<div class="form-group">
		  <label class="control-label col-sm-2" for="email">Repas:</label>
		  <div class="col-sm-10">
		    <form:input path="libelle" cssClass="form-control" placeholder="repas"/>
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

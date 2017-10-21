<c:import url="../fragments/header.jsp"/>
<body>
    <div id="wrapper">
    	<c:import url="../navbar.jsp"/>
    
    <div id="page-wrapper">
		
			<h2>Ajouter une filière</h2>
			<br><br><br><br>
			<spring:url value="/role/add" var="formUrl"/>
			<form:form action="${formUrl}" method="POST" modelAttribute="role" cssClass="form-horizontal">
			<form:input type="hidden" path="id"/>
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
	</div>
</body>
</html>
	
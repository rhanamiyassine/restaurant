<c:import url="../fragments/header.jsp"/>
<body>
    <div id="wrapper">
	    <c:import url="../navbar.jsp"/>
	    <div id="page-wrapper">
			<h2>Déclarer une plainte</h2>
			<br><br><br><br>
			<spring:url value="/plainte/add" var="formUrl"/>
			<form:form action="${formUrl}" method="POST" modelAttribute="plainte" cssClass="form-horizontal">
			<form:input type="hidden" path="id"/>
			<div class="form-group">
			  <label class="control-label col-sm-2" for="email">Filière:</label>
			  <div class="col-sm-10">
			    <form:input path="titre" cssClass="form-control" placeholder="titre de la plainte"/>
			  </div>
			</div>
			<div class="form-group">
			  <label class="control-label col-sm-2" for="email">Description:</label>
			  <div class="col-sm-10">
			    <form:input path="description" cssClass="form-control" placeholder="description de la filiere"/>
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
	
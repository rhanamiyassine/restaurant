<c:import url="../fragments/header.jsp"/>
<body>
    <div id="wrapper">
	    <c:import url="../navbar.jsp"/>
	    <div id="page-wrapper">
			<h2>Déclarer une categorie</h2>
			<br><br><br><br>
			<spring:url value="/categorie/add" var="formUrl"/>
			<form:form action="${formUrl}" method="POST" modelAttribute="categorie" cssClass="form-horizontal">
			<form:input type="hidden" path="id"/>
			<div class="form-group">
			  <label class="control-label col-sm-2" for="email">Catégorie:</label>
			  <div class="col-sm-10">
			    <form:input path="libelle" cssClass="form-control" placeholder="titre de la categorie"/>
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
	
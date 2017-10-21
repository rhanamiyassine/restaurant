<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; UTF-8">
	<c:import url="../fragments/css.jsp"/>
	<title>Les comptes</title>
</head>
<body>
	<c:import url="../fragments/header.jsp"/>
	<a href="add" class="btn btn-info btn-small">
		<span class="glyphicon glyphicon-plus"></span>Ajouter 
	</a>
	  <table class="table">
	    <thead>
	      <tr>
	        <th>id</th>
	        <th>nom</th>
	        <th>action</th>
	      </tr>
	    </thead>
	    <tbody>
	      <c:forEach var="repas" items="${repas}">
	      <tr>
	        <td>${repas.id}</td>
	        <td>${repas.libelle}</td>
	        <td>
			    <a href="${repas.id}" class="btn btn-info btn-small">
		          <span class="glyphicon glyphicon-plus"></span>Modifier 
		        </a>	
		        <a href="remove/${repas.id}" class="btn btn-info btn-small">
		          <span class="glyphicon glyphicon-plus"></span>Supprimer 
		        </a>
			</td>
	      </tr>
	      </c:forEach>
	    </tbody>
	  </table>
	<c:import url="../fragments/js.jsp"/>
</body>

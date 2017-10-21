<c:import url="../fragments/header.jsp"/>
<body>
    <div id="wrapper">
	    <c:import url="../navbar.jsp"/>
	    <div id="page-wrapper">
			
			
			<div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-bar-chart-o"></i> liste des categories : </h3>
                        </div>
                        <div class="panel-body">
                            <div id="shieldui-grid1">
                            <a href="add" class="btn btn-info btn-small"><span class="glyphicon glyphicon-plus"></span>Ajouter </a>
			
			
                            <table class="table">
							    <thead>
							      <tr>
							        <th>id</th>
							        <th>Titre</th>
							        <th>Action</th>
							      </tr>
							    </thead>
							    <tbody>
							      <c:forEach var="categorie" items="${categories}">
							      <tr>
							        <td>${categorie.id}</td>
							        <td>${categorie.libelle}</td>
							        
							        <td>
									    <a href="${categorie.id}" class="btn btn-info btn-small">
								          <span class="glyphicon glyphicon-plus"></span>Modifier 
								        </a>	
								        <a href="remove/${categorie.id}" class="btn btn-danger btn-small">
								          <span class="glyphicon glyphicon-plus"></span>Supprimer 
								        </a>
									</td>
							      </tr>
							      </c:forEach>
							    </tbody>
							  </table>
                            
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
			  
		</div>
	</div>
</body>
</html>
		
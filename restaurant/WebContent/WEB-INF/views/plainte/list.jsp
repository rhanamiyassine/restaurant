<c:import url="../fragments/header.jsp"/>
<body>
    <div id="wrapper">
	    <c:import url="../navbar.jsp"/>
	    <div id="page-wrapper">
			
			
			<div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <h3 class="panel-title"><i class="fa fa-bar-chart-o"></i> liste des plaintes : </h3>
                        </div>
                        <div class="panel-body">
                            <div id="shieldui-grid1">
                            <a href="add" class="btn btn-info btn-small"><span class="glyphicon glyphicon-plus"></span>Ajouter </a>
			
			
                            <table class="table">
							    <thead>
							      <tr>
							        <th>id</th>
							        <th>Titre</th>
							        <th>Description</th>
							        <th>Action</th>
							      </tr>
							    </thead>
							    <tbody>
							      <c:forEach var="plainte" items="${plaintes}">
							      <tr>
							        <td>${plainte.id}</td>
							        <td>${plainte.titre}</td>
							        <td>${plainte.description}</td>
							        <td>
									    <a href="${plainte.id}" class="btn btn-info btn-small">
								          <span class="glyphicon glyphicon-plus"></span>Modifier 
								        </a>	
								        <a href="remove/${plainte.id}" class="btn btn-danger btn-small">
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
		
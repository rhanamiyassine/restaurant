<nav class="navbar navbar-default">
	<div class="container">
    	<div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
          </button>
          <a class="navbar-brand" href="#">Restaurant</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="<spring:url value="/home"/>">Accueil</a></li>
            <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
	           aria-haspopup="true" aria-expanded="false">Paramètres<span class="caret"></span></a>
	          <ul class="dropdown-menu">
	            <li><a href="<spring:url value="users"/>">Comptes</a></li>
	            <li><a href="<spring:url value="/filiere/list"/>">Filières</a></li>
	          </ul>
	        </li>
          </ul>
        </div>
	</div>
</nav>
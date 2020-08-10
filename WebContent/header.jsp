<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/fontawesome.all.min.js"></script>

<style>
.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: #555 !important;
	color: white;
	text-align: center;
}
</style>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<a class="navbar-brand" href="livres.jsp">Bibliothèque</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		<ul class="navbar-nav mr-auto">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false">Gestion des livres</a>
				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<a class="dropdown-item" href="ajouterLivre.jsp">Ajouter</a> <a
						class="dropdown-item" href="#">Voir</a> <a class="dropdown-item"
						href="#">Mettre àjour</a>
					<div class="dropdown-divider"></div>
					<a class="dropdown-item" href="#">Supprimer</a>
				</div></li>
		</ul>
	</div>
</nav>
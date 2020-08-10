<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Biblioth�que AFPA 2020 Projet Lud972vic</title>
<<<<<<< HEAD
</head>

=======
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<link href="css/styles.css" rel="stylesheet" type="text/css" />

<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
<script src="js/fontawesome.all.min.js"></script>

</head>
>>>>>>> ff048f9dee92c61a0de59af0fd5be35305fa08f8
<body>
	<%@include file="header.jsp"%>

	<div class="container mt-5 mb-5">
<<<<<<< HEAD

		<p align="center">
			<img src="img/BookGIF.gif" alt="image arbre biblioth�que"
				height="213px" width="313px">
		</p>

=======
		<p class="aligncenter">
			<img src="img/bibliotheque2.jpg" alt="image arbre biblioth�que"
				height="213px" width="313px">
		</p>
>>>>>>> ff048f9dee92c61a0de59af0fd5be35305fa08f8
		<div class="card">
			<div class="card-header">Recherche de livres</div>
			<div class="card-body">
				<form action="chercher.do" method="get">
					<label>Mots Cl�s</label> <input type="text" name="motsCles"
						value="${model.motsCles}" />
					<button type="submit" class="btn btn-outline-dark">Chercher</button>
				</form>
				<table class="table table-striped table-dark mt-2">
					<tr>
						<th>Id</th>
						<th>Titre</th>
						<th>Description</th>
						<th>ISBN</th>
						<th>Code</th>
					</tr>
					<c:forEach items="${model.livres}" var="l">
						<tr>
							<td>${l.idlivres }</td>
							<td>${l.titre }</td>
							<td>${l.description }</td>
							<td>${l.isbn }</td>
							<td>${l.code }</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
<<<<<<< HEAD
	<%@include file="footer.jsp"%>
=======
>>>>>>> ff048f9dee92c61a0de59af0fd5be35305fa08f8
</body>
</html>
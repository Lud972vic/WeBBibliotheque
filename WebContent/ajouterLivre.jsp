<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Ajouter un livre</title>
<<<<<<< HEAD
=======
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
>>>>>>> ff048f9dee92c61a0de59af0fd5be35305fa08f8
</head>
<body>
	<%@include file="header.jsp"%>

	<p></p>
	<div class="container">
		<div class="card">
			<div class="card-header">Ajouter un livre</div>
			<div class="card-body">
				<form action="ajouter.do" method="post">
					<div class="form-group">
						<label class="control-label">Titre :</label> <input type="text"
							name="titre" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label">Description :</label> <input
							type="text" name="description" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label">ISBN :</label> <input type="text"
							name="isbn" class="form-control" />
					</div>
					<div class="form-group">
						<label class="control-label">Code :</label> <input type="text"
							name="code" class="form-control" />
					</div>

					<div>
						<button type="submit" class="btn btn-outline-dark">Ajouter</button>
					</div>
				</form>
			</div>
		</div>
	</div>
<<<<<<< HEAD
	<%@include file="footer.jsp"%>
=======
>>>>>>> ff048f9dee92c61a0de59af0fd5be35305fa08f8
</body>
</html>
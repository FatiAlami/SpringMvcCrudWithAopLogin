<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Login</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" />
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<div class="container">
		<jsp:include page="../layout/header.jsp" />
		<div class="row d-flex justify-content-center">
			<div class="col-lg-6 bg-info">
				<h1>Se Connecter</h1>
				<form method="POST"
					action="${pageContext.request.contextPath}/login/check">
					<div class="form-group">
						<label for="email">Email address</label> <input type="email"
							class="form-control" name="email" id="email"
							aria-describedby="email" placeholder="Enter email"> <small
							id="emailHelp" class="form-text text-muted">We'll never
							share your email with anyone else.</small>
					</div>
					<div class="form-group">
						<label for="password">Password</label> <input type="password"
							class="form-control" name="password" id="password"
							placeholder="Password">
					</div>
					<div class="form-group">
						<a href="${pageContext.request.contextPath}/register">Vous n'avez pas un compte? s'inscrire ici.</a>
					</div>
					
					<input type="submit" class="btn btn-info" value="Submit" />
				</form>
			</div>
		</div>
	</div>
</body>
</html>

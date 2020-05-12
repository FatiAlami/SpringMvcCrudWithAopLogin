<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Ajouter article</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet" />
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</head>
<body>
	<jsp:directive.include file="../layout/header.jsp" />

	<!-- SECTION LOGIN -->
	<section>
		<div class="container">
			<div class="row d-flex justify-content-center">
				<div class="col-md-6">
					<form:form
						action="${pageContext.request.contextPath}/register/validate"
						class="POST" modelAttribute="user">
						<div class="form-group row">
							<div class="col-md-12">
								<label>Username</label>
								<form:input class="form-control"
									placeholder="Enter your username" path="username" />
								<form:errors class="error" path="username" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-md-12">
								<label>Email</label>
								<form:input class="form-control" placeholder="Enter your email"
									path="email" />
								<form:errors class="error" path="email" />
							</div>
						</div>
						<div class="form-group row">
							<div class="col-md-12">
								<label>Password</label>
								<form:input class="form-control"
									placeholder="Enter your password" path="password" />
								<form:errors class="error" path="password" />
							</div>
						</div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form:form>
				</div>
			</div>
		</div>
	</section>
</body>
</html>

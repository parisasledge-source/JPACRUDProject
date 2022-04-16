<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Planet Data</title>
<jsp:include page="bootstraphead.jsp" />
</head>
<body>

<div class="container-fluid">
	<h1>Planet Data</h1>

	<div>
		<h5>${planet.name}(${planet.color})</h5>
		<p>${planet.description}</p>
	</div>
</div>

</body>
</html>
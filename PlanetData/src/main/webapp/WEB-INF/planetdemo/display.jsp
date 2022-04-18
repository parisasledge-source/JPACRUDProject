<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Planet Data</title>
<jsp:include page="../bootstraphead.jsp" />
</head>
<body>
<c:choose>
<c:when test="${! not empty planet.id }">

<a href= "home.do"> Home</a>
</c:when>

<c:otherwise>


<div class="container-fluid">
	<h1>    </h1>

	<div>
		<h1>${planet.name}</h1><h3>The (${planet.color}) Planet</h3>
		<p>${planet.description}</p>
	</div>
</div>

</c:otherwise>
</c:choose>


</body>
</html>
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
		<c:when test="${! not empty planet }">

			<a href="home.do"> Home</a>
		</c:when>

		<c:otherwise>


			<div class="container-fluid">
				<!-- <h1>Welcome to the Observatory!</h1>
 -->
				<div>
					<h2>${planet.name}</h1>
						<h4>${planet.color}</h4>
						<p>${planet.description}</p>
						<img
							src="https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fwww.granjaviana.com.br%2Fupload%2Fcoluna%2F5cf863679b347-_colunamarcia.jpg"></a>
				</div>
			</div>

		</c:otherwise>
	</c:choose>


</body>
</html>
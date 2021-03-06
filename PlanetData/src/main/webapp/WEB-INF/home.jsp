<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Planets</title>
</head>
<body>
	<%@ include file="bootstraphead.jsp"%>
	<main class="container-fluid">
		<h1>Welcome to Planets Data</h1>
		${DEBUG}
		<form action="getPlanet.do" method="GET">
			Planet ID: <input type="text" name="id" /> <input type="submit"
				value="Display Planet" />
		</form>

		<form action="addPlanet.do" method="GET">
			Planet Name: <input type="text" name="name" /> Planet Color: <input
				type="text" name="color" /> <input type="submit"
				value="Add Planet" />
		</form>

		</form>

		<form action="updatePlanet.do" method="POST">
			Planet ID: <input type="text" name="id" /> Planet Name: <input
				type="text" name="name" /> Planet Color: <input type="text"
				name="color" /> <input type="submit" value="Update Planet" />
		</form>

		<form action="deletePlanet.do" method="POST">
			Planet ID: <input type="text" name="planetId" />
			<!-- Planet Color: <input type="text" name="color" />  -->
			<input type="submit" value="Delete Planet" />
		</form>

		<img
			src="https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fsolarsystem.nasa.gov%2Finternal_resources%2F517"></a>

		<table class="table table-striped">
			<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>Title</th>
				</tr>
			</thead>
			<tbody>
				</tr>
				<c:forEach var="p" items="${planets}">
					<tr>
						<td>${p.id}</td>
						<td><a href="getPlanet.do?id=${p.id}">${p.name}</a></td>
				</c:forEach>
			</tbody>
		</table>
		<!-- 						<td><img
				src="https://slack-imgs.com/?c=1&o1=ro&url=https%3A%2F%2Fsolarsystem.nasa.gov%2Finternal_resources%2F517"
				></a></td> -->
	</main>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>
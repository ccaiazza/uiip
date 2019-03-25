<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Reparto Listing</title>
<body>
	<h1>Departments Listing:</h1>
	<p>
	<ul>
		<c:forEach var="reparto" items="${reparti}">
			<li><a href="./reparti/${reparto.code}">${reparto.code}</a></li>
			<br> Name: ${reparto.name}
				<br> Name: ${reparto.patients}
				</c:forEach>
			
		
	</ul>
	
	</p>
</body>
</html>

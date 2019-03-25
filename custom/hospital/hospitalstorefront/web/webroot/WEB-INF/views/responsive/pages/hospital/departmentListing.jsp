<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Department Listing</title>
<body>
	<h1>Department Listing</h1>
	<p>
	<ul>
		<c:forEach var="reparto" items="${reparti}">
			
	<br> Name: ${reparto.name}
	
	<br> Head: ${reparto.getHead().getUid()}
	
	<br> Hospital: ${reparto.getHospital().getCode()}
		</c:forEach>
	</ul>
	</p>
</body>
</html>

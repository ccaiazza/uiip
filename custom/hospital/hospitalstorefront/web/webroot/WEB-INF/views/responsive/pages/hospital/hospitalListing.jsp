<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Hospital Listing</title>
<body>
	<h1>Hospital Listing</h1>
	<p>
	<ul>
		<c:forEach var="hospital" items="${hospitals}">
			<li><a href="./hospitals/${hospital.code}">${hospital.code}</a></li>
			<a href="./hospitals/${hospital.name}">${hospital.name}</a>
			<a href="./hospitals/${hospital.citta}">${hospital.citta}</a>	
		</c:forEach>
	</ul>
	
	</p>
</body>
</html>

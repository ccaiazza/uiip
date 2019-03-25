<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Reparto Details</title>
<body>
	<h1>Reparto Details</h1>

	Reparto Details for ${code} :
	<br>
	<br>

	<br>
	<ul>
		<c:forEach var="reparto" items="${repartu}">
			<li>${reparto.getCode()}&nbsp;${ reparto.getName()} &nbsp; with
				head ${reparto.getHead().getUid() } &nbsp; and &nbsp; with hospital
				${reparto.getHospital().getCode() }  &nbsp;</li>

		</c:forEach>
	</ul>

</body>
</html>
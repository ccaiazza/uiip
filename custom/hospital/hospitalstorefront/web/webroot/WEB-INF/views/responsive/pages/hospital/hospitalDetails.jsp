<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<title>Hospital Details</title>
<body>
	<h1>Hospital Details</h1>


	Hospital Details for ${hospital.code}
	<c items="${hospital}">
	</c>
	<br>
	
	<br> Name: ${hospital.name}
	<br> City: ${hospital.citta}
	<br> Number Departments: ${hospital.numberRep}
	<br>
	
	<!--  
            <ul>
             <c:forEach var="match" items="${stadium.matches}">
                <li>${match.matchSummaryFormatted}</li>
              </c:forEach>
            </ul>
     -->
     <br> <a href="../hospitals">Back to Hospital Listing</a>
</body>
</html>
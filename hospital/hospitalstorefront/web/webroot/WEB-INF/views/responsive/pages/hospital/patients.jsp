<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Patients Details</title>
    <body>
        <h1>Patients Details</h1>
 
        Patients Details for ${entry}<br><br>
            
            :<br>
            <ul>
             <c:forEach var="patients" items="${patients}">
                <li>${patients.name} &nbsp; ${patients.uid}</li>
              </c:forEach>
            </ul>
      
    </body>
</html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Reparto Details</title>
    <body>
        <h1>Reparto Details</h1>
 
      
            
            :<br>
            <ul>
             <c:forEach var="reparto" items="${reparti}">
                <li>${reparto.nameRep}</li>
                <li>${reparto.numberRep}</li>
              </c:forEach>
            </ul>
      
    </body>
</html>
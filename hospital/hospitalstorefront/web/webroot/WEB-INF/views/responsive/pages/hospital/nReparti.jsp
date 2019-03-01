<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>numero Reparto</title>
    <body>
        <h1>numero Reparto</h1>
 
        Reparto Details for ${hospitalCode}<br><br>
            
            :<br>
            <ul>
             <c:forEach var="reparto" items="${reparti}">
                <li>${reparto.numberRep}</li>
              </c:forEach>
            </ul>
      
    </body>
</html>
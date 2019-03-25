<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
     <title>Pathologies</title>
    <body>
        <h1>Pathologies</h1>
 
        Pathologies Details for patient ${codePatient} :<br><br>
            
            <br>
            <ul>
             <c:forEach var="pathology" items="${pathology}">
                <li>${pathology.name}</li>
              </c:forEach>
            </ul>
      
    </body>
</html>
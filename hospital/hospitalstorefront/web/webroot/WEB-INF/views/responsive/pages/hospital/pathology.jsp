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
                <li>${pathology.getName()} &nbsp;  <c:forEach var="patients" items="${pathology.getPatients()}"> ${patients.getName()} &nbsp; </c:forEach></li>
              </c:forEach>
            </ul>
      
    </body>
</html>
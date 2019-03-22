<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Reparto Details</title>
    <body>
        <h1>Reparto Details</h1>
 
        Reparto Details for ${code} :<br><br> 
            
            <br>
          <ul> 
             <c:forEach var="reparto" items="${repartu}"> 
                <li>${reparto.getCode()} ${ reparto.getName()}</li> 
               </c:forEach>
            </ul> 
      
    </body>
</html>
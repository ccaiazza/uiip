<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Ospedali</title>
    <body>
        <h1>Hospital  :</h1>
 
       <br><br>
            
            <br>
            <ul>
              <c:forEach var="nReparti" items="${nReparti}"> 
              <li>${nReparti.code} &nbsp; ${nReparti.name} &nbsp; with city:  &nbsp; ${nReparti.citta} &nbsp; with number departament:  &nbsp; ${nReparti.getNumberRep()} </li> 
               </c:forEach> 
            </ul>
            
           
            
        
             
      
    </body>
</html>
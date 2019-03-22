<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Ospedali</title>
    <body>
        <h1>Elenco città :</h1>
 
       <br><br>
            
            <br>
            <ul>
              <c:forEach var="nReparti" items="${nReparti}"> 
              <li>${nReparti.citta}</li> 
               </c:forEach> 
            </ul>
            
             <h1>Nome ospedale :</h1>
              <ul>
              <c:forEach var="nReparti" items="${nReparti}"> 
              <li>${nReparti.name}</li> 
               </c:forEach> 
            </ul>
            
             <h1>Codice ospedale :</h1>
              <ul>
              <c:forEach var="nReparti" items="${nReparti}"> 
              <li>${nReparti.code}</li> 
               </c:forEach> 
            </ul>
      
    </body>
</html>
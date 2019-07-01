<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
    <title>Medicine Details: </title>
    <body>
        <h1>Medicine Details:</h1>
 
       Medicine Details for ${code}
            
            :<br> <br> <br> <br>
            Code: &nbsp; ${product.code} <br><br>
            Name:&nbsp; ${product.name}<br><br>
            URL: &nbsp; ${product.url}<br><br>
            Manufacturer:&nbsp; ${product.manufacturer}<br><br>
            AverageRating:&nbsp; ${product.averageRating} <br><br>
            VariantType: &nbsp; ${product.variantType}   <br> <br>
            Purchasable: &nbsp; ${product.purchasable}   <br><br>
            Configurable: &nbsp; ${product.configurable}   <br><br>
            Description: &nbsp; ${product.description}   <br><br>
             <c:forEach var="category" items="${product.categories}"> 
                Category:&nbsp; &nbsp;&nbsp; &nbsp; Name: ${category.name}&nbsp; &nbsp; Code: ${category.name}<br>
              </c:forEach>
            <br>          
<%--             Price: &nbsp; ${product.price.value}   <br> --%>
<%--             Categories: &nbsp; ${product.categories}   <br><br> --%>
            Action: &nbsp; ${product.action}   <br><br>
            Age: &nbsp; ${product.age}   <br><br>
            Pregnancy:  &nbsp; ${product.pregnancy}   <br><br>
            Symtom:&nbsp; ${product.symtom}   <br><br>
            Use: &nbsp; ${product.use}   <br><br>
            ManufacturerAID: &nbsp; ${product.manufacturerAID}   <br><br>
            OfflineDate: &nbsp; ${product.offlineDate}   <br><br>
            OnlineDate: &nbsp; ${product.onlineDate}   <br><br>
            Ean: &nbsp; ${product.ean}   <br><br>
            Price Quantity: &nbsp; ${product.priceQuantity}   <br><br>
            Approval Status: &nbsp; ${product.approvalStatus}   <br><br>
            Base Product : &nbsp; ${product.baseProduct}
            Base Option : &nbsp;   <c:forEach var="baseOption" items="${product.baseOptions}">
                VariantType: ${baseOption.variantType}&nbsp; &nbsp; Code: ${baseOption.selected.code} &nbsp; &nbsp; Stock: ${baseOption.selected.stock.stockLevel} &nbsp; &nbsp; URL: ${baseOption.selected.url} &nbsp; &nbsp; Price:${baseOption.selected.priceData.value}<br>
                Options:  <c:forEach var="option" items="${baseOption.options}">
                ${option.code}&nbsp; </c:forEach>
              </c:forEach>
    </body>
</html>
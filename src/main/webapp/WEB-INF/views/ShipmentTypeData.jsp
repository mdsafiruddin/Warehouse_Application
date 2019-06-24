<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShipmentType</title>
</head>
<body>
<a href="excel">Excel Export</a>
<a href="pdf">PDF Export</a>
<h3  style="color:red"> Welcome to ShipmentType Data Page </h3>
<table border ="1"style="color:blue"  >
      <tr  style="color:green">
                       <td>ID</td>
                      <td>MODE</td>
                      <td>CODE</td>
                      <td>ENABLE</td>
                      <td>GRADE</td>
                      <td>NOTE</td>
                      <td colspan="3">OPERATION</td>
     </tr>
     <c:forEach items="${list}"  var="ob">
    
     <tr>
        
                  <td><c:out value="${ob.id }"/></td>
                  <td><c:out value="${ob.shipmentMode }"/></td>
                  <td><c:out value="${ob.shipmentCode }"/></td>
                 <td><c:out value="${ob.enableShipment }"/></td>
                 <td><c:out value="${ob.shipmentGrade }"/></td>
                 <td><c:out value="${ob.note }"/></td>
                  <td> <a href="delete?id=${ob.id}"> <img  src="../resources/images/delete.png" width="30" height="30"/></a> </td>
                   <td> <a href="edit?id=${ob.id}"><img  src="../resources/images/edit2.png" width="30" height="30"/></a> </td>
                    <td> <a href="view?id=${ob.id}"><img  src="../resources/images/view.png" width="30" height="30"/></a> </td>
                 </tr>
                 </c:forEach>
</table>
        ${msg } <br>
        <br>
 <b> <a href=" reg">HOME</a> </b>

</body>
</html>
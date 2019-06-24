<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h3 style="color:red"> welcome to ShipmentType  View page</h3>
 <table border="1" style="color:blue">
       <tr>
       <th>ID</th>  <td> ${ob.id}</td>
       </tr>
       <tr>
       <th>MODE</th>  <td> ${ob.shipmentMode}</td>
       </tr>
       <tr>
       <th>CODE</th>  <td> ${ob.shipmentCode}</td>
       </tr>
       <tr>
       <th>ENABLE</th>  <td> ${ob.enableShipment}</td>
       </tr>
       <tr>
       <th>GRADE</th>  <td> ${ob.shipmentGrade}</td>
   
       </tr>
       <tr>
       <th>NOTE</th>  <td> ${ob.note}</td>
       </tr>
       </table>
       
       <pre>
         <a href="delete?id=${ob.id}">Delete from here</a> 
           <a href="edit?id=${ob.id}">Edit from here</a> 
             <a href="excel?id=${ob.id}">Excel Export</a> 
                 <a href="pdf?id=${ob.id}">PDF Export</a> 
       
   
     </pre>
</body>
</html>
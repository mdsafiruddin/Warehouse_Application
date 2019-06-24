<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h3 style="color:red"> welcome to Item View page</h3>
 <table border="1">
       <tr>
       <th>ID</th>  <td> ${ob.id}</td>
       </tr>
       <tr>
       <th>CODE</th>  <td> ${ob.itemCode}</td>
       </tr>
       <tr>
       <th>MODE</th>  <td> ${ob.itemWidth}</td>
       </tr>
       <tr>
       <th>ETYPE</th>  <td> ${ob.itemLen}</td>
       </tr>
       <tr>
       <th>ACCEPT</th>  <td> ${ob.itemHeight}</td>
       </tr>
       <tr>
       <th>NOTE</th>  <td> ${ob.baseCost}</td>
       </tr>
        <tr>
       <th>NOTE</th>  <td> ${ob.baseCurrency}</td>
       </tr>
       </table>
       
       <pre>
         <a href="delete?id=${ob.id}">Delete from here</a> 
           <a href="edit?id=${ob.id}">Edit from here</a> 
         <h2> <a style= "color:red" href="reg">GOTO HOME</a></h2>
     </pre>
</body>
</html>
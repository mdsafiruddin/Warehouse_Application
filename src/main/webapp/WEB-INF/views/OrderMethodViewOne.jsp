<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h3 style="color:red"> welcome to order method View page</h3>
 <table border="1">
       <tr>
       <th>ID</th>  <td> ${ob.id}</td>
       </tr>
       <tr>
       <th>CODE</th>  <td> ${ob.mode}</td>
       </tr>
       <tr>
       <th>MODE</th>  <td> ${ob.code}</td>
       </tr>
       <tr>
       <th>ETYPE</th>  <td> ${ob.etype}</td>
       </tr>
       <tr>
       <th>ACCEPT</th>  <td> ${ob.accept}</td>
   
       </tr>
       <tr>
       <th>NOTE</th>  <td> ${ob.note}</td>
       </tr>
       </table>
       
       <pre>
         <a href="delete?id=${ob.id}">Delete from here</a> 
           <a href="edit?id=${ob.id}">Edit from here</a> 
         <a href="reg">GOTO HOME</a>
   
     </pre>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h3 style="color:red"> welcome to order method View page</h3>
 <table border="1" style="color:red">
       <tr>
       <th>ID</th>  <td> ${ob.id}</td>
       </tr>
       <tr>
       <th>CODE</th>  <td> ${ob.userType}</td>
       </tr>
       <tr>
       <th>MODE</th>  <td> ${ob.userCode}</td>
       </tr>
       <tr>
       <th>ETYPE</th>  <td> ${ob.userFor}</td>
       </tr>
        <tr>
       <th>ETYPE</th>  <td> ${ob.userEmail}</td>
       </tr>
        <tr>
       <th>ETYPE</th>  <td> ${ob.ucontact}</td>
       </tr>
      <tr>
       <th>ETYPE</th>  <td> ${ob.uidType }</td>
       </tr>
      <tr>
       <th>ETYPE</th>  <td> ${ob.idNumber}</td>
       </tr>
       </table >
       
       
       
       <pre>
         <a href="delete?id=${ob.id}">Delete from here</a> 
           <a href="edit?id=${ob.id}">Edit from here</a> 
           <a href="reg">GOTO HOME</a>
       
   
     </pre>
</body>
</html>
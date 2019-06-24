<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WareUserType</title>
</head>
<body>
<h3  style="color:red"> Welcome to WareUerType Data Page </h3>
<table border ="1"style="color:blue"  >
      <tr  style="color:green">
                       <td>ID</td>
                      <td>TYPE</td>
                      <td>CODE</td>
                      <td>FOR</td>
                      <td>EMAIL</td>
                      <td>CONTACT</td>
                      <td>ID TYPE</td>
                      <td>ID NUMBER</td>
                      <td>OPERATION</td>
     </tr>
     <c:forEach items="${list}"  var="ob">
    
     <tr>
                  <td><c:out value="${ob.id}"/></td>
                  <td><c:out value="${ob.userType}"/></td>
                  <td><c:out value="${ob.userCode}"/></td>
                 <td><c:out value="${ob.userFor}"/></td>
                 <td><c:out value="${ob.userEmail}"/></td>
                 <td><c:out value="${ob.ucontact}"/></td>
                  <td><c:out value="${ob.uidType}"/></td>
                   <td><c:out value="${ob.idNumber}"/></td>
                   
                  <td> <a href="delete?id=${ob.id}">Delete</a> </td>
                   <td> <a href="edit?id=${ob.id}">Edit</a> </td>
                    <td> <a href="view?id=${ob.id}">View</a> </td>
                 </tr>
                 </c:forEach>
</table>
        ${msg } <br>
        <br>
 <b> <a href=" reg">HOME</a> </b>

</body>
</html>
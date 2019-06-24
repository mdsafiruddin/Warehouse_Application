<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Method</title>
</head>
<body>
<h3  style="color:red"> OrderMethod Data Page </h3>
<table border ="1"style="color:blue"  >
      <tr  style="color:green">
                       <td>ID</td>
                      <td>MODE</td>
                      <td>CODE</td>
                      <td>ETYPE</td>
                       <td>ACCEPT</td>
                        <td>NOTE</td>
                      <td colspan="3">OPERATION</td>
     </tr>
     <c:forEach items="${list}"  var="ob">
    
     <tr>
        
                  <td><c:out value="${ob.id }"/></td>
                  <td><c:out value="${ob.mode }"/></td>
                  <td><c:out value="${ob.code }"/></td>
                 <td><c:out value="${ob.etype }"/></td>
                 <td><c:out value="${ob.accept}"/></td>
                 <td><c:out value="${ob.note }"/></td>
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
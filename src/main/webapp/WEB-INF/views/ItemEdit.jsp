<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
  <h3>Welcome to Item register page</h3>
  <form:form action="update" method="POST" modelAttribute="item">
   <pre>
   
Item ID:
<form:input path="id" readOnly="true"/>

Item code:: <form:input path="itemCode" readOnly="true"/> 

Item Dimension:: <form:input path="itemWidth" value=""/>W 
                 <form:input path="itemLen" value=""/>L
                 <form:input path="itemHeight" value=""/>H
          
    Base Cost:: <form:input path="baseCost"/>
    
    Base Currency:: <form:select path="baseCurrency">
                                 <form:option value=" ">SELECT</form:option>
                                 <form:option value="INR">INR</form:option>
                                 <form:option value="USD">USD</form:option>
                                 <form:option value="AUS">AUS</form:option>
                                 <form:option value="ERU">ERU</form:option>
 								  </form:select>
    
    <input type="submit" value="update"/>
    </pre>
   </form:form>
   <a href="all">view all</a>
</body>
</html>
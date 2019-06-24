<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<html>
<body>
<h2 style="color:green">welcome to OrderMethod Register Page!!</h2>
<form:form action="update" method="POST" modelAttribute="orderMethods">
<pre>
  Order ID:
  <form:input path="id" readOnly="true"/>

 Order Mode:
  <form:radiobutton path="mode" value="Sale"/> Sale
  <form:radiobutton path="mode" value="Purchase"/> Purchase
  
 Order Code:
  <form:input path="code" readOnly="true"/>
   
 Execution Type:
   <form:select path="etype">
   	 <form:option value="">-SELECT-</form:option>
   	 <form:option value="FIFO">FIFO</form:option>
   	 <form:option value="LIFO">LIFO</form:option>
   	 <form:option value="FEFO">FEFO</form:option>
   	 <form:option value="FCFO">FCFO</form:option>
   </form:select>
   
 Order Accept:
  <form:checkbox path="accept" value="Multi-Model"/>  Multi-Model    
  <form:checkbox path="accept" value="Accept-Return"/>  Accept-Return    
  <form:checkbox path="accept" value="Service Extended "/>  Service Extended
  
 Note:
  <form:textarea path="note"/>
  
  <input type="submit" value="Update"/> 	      
</pre>
</form:form>

</body>

</html>
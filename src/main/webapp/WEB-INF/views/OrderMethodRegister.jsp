<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<html>
<body>
<h3>welcome to OrderMethod Register Page!!</h3>
<form:form action="save" method="POST" modelAttribute="orderMethod">
<pre>
 Order Mode:
  <form:radiobutton path="mode" value="Sale"/> Sale
  <form:radiobutton path="mode" value="Purchase"/> Purchase
  
 Order Code:
  <form:input path="code"/>
   
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
  
  <input type="submit" value="Register"/> 	      
</pre>
</form:form>
${msg} <br/>
<a href="all">View All</a>
</body>

</html>
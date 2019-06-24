<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
 <h3>welcome to Uom Register Page!!</h3>
<form:form action="save" method="" modelAttribute=" ">
<pre>

 UoM Type:: <form:select path="uomType">
   	<form:option value="">-SELECT-</form:option>
    <form:option value="PACKING">PACKING</form:option>
    <form:option value="NO PACKING">NO PACKING</form:option>
     <form:option value="-NA">-NA</form:option>
</form:select>

Uom Model:: <form:input path="uomModel"/>

Description:: <form:textarea path="note"/>

<input type="submit" value="Register"/> 	      
</pre>
</form:form>
       ${msg} <br/>
<a href="all">View All</a>
       ${msg}
</body>
</html>
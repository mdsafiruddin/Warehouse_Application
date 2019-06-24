<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<html>
<body>
<h3>welcome to OrderMethod Register Page!!</h3>
<form:form action="update" method="POST" modelAttribute="shipmenttype">
<pre>
    Shipment Id::<form:input path="id" readOnly="true"/>
    
   Shipment Mode: <form:select path="shipmentMode">
   	   <form:option value="">-SELECT-</form:option>
   	 <form:option value="AIR">AIR</form:option>
   	 <form:option value="TRUCK">TRUCK</form:option>
   	 <form:option value="SHIP">SHIP</form:option>
   	 <form:option value="TRAIN">FICO</form:option>
   </form:select>
   
 Shipment Code: <form:input path="shipmentCode" readOnly="true"/>

  Enable Shipment: <form:select path="enableShipment">
   	<form:option value="">-SELECT-</form:option>
    <form:option value="YES">YES</form:option>
    <form:option value="NO">NO</form:option>
</form:select>


 Shipment Grade:  <form:radiobutton path="shipmentGrade" value="A"/> A<form:radiobutton path="shipmentGrade" value="B"/> B <form:radiobutton path="shipmentGrade" value="C"/>C
  
 Note:  <form:textarea path="note"/>
  
  <input type="submit" value="Update"/> 	      
</pre>
</form:form>
${msg} <br/>
<a href="all">View All</a>
</body>
</html>
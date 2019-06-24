<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
  <h3 style="color:red">Welcome to Item register page</h3>
  <form:form action="save" method="POST" modelAttribute="item">
   <pre>
    Item Code:: <form:input path="itemCode"/> 

Item Dimension:: <form:input path="itemWidth" value=""/>W <br>
                 <form:input path="itemLen" value=""/>L<br>
                 <form:input path="itemHeight" value=""/>H
          
    Base Cost:: <form:input path="baseCost"/>
    
    Base Currency:: <form:select path="baseCurrency">
                                 <form:option value=" ">SELECT</form:option>
                                 <form:option value="INR">INR</form:option>
                                 <form:option value="USD">USD</form:option>
                                 <form:option value="AUS">AUS</form:option>
                                 <form:option value="ERU">ERU</form:option>
 								  </form:select>
    
   <input type="submit" value="Register"  class="btn btn-success"/>
    </pre>
   </form:form>
   <a style= "color:red" href="all">view all</a>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
  <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<HTML>
 <HEAD>
  <TITLE> Welcome to Warehouse Register Page </TITLE>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
 </HEAD>

 <BODY>
   <div class="container">
 
       <div class="card"> 

          <div class="card-header bg-primary text-green">
		  <h3 style="color:red" >Welcome to warehouse user Page </h3>
         </div>
     

	  <div class="card-body">
		 <form action="save" method="POST">
       



	 <div class="row">
		<div class="col-2">
		<label ref="gen" class="control-label" style="color:red">user Type</label>
		</div>
			<div class="col-6" style="color:blue">
			<input type="radio" name="grade" value="f" name="userType"/>vendor
			<input type="radio" name="grade" value="m" name="userType"/>customer
			
		</div>
	   </div>


	   	<div class="row">
		<div class="col-2">
		<label ref="code" class="control-label" style="color:red">user code</label>
		</div>
			<div class="col-5">
			<input type="text" id="code" class="form-control" name="userCode"/>
		</div>
		</div>

	
		<div class="row">
		<div class="col-2">
		<label ref="user" class="control-label" style="color:red"> user for </label>
		</div>
			<div class="col-5">
			<Select id="user" class="form-control" name="userFor">
			<option value="">select</option>
			<option value="purchase">Purchase</option>
			<option value="sale">Sale</option>	
			</select>
			</div>
			</div>

	     <div class="row">
		<div class="col-2">
		<label ref="email" class="control-label" style="color:red">User Email</label>
		</div>
			<div class="col-5">
			<input type="text" id="email" class="form-control" name="userEmail"/>
		</div>
		</div>


		<div class="row">
		<div class="col-2">
		<label ref="contact" class="control-label" style="color:red">User Contact</label>
		</div>
			<div class="col-5">
			<input type="text" id="contact" class="form-control" name="ucontact"/>
		</div>
		</div>

		<div class="row">
		<div class="col-2">
		<label ref="idtype" class="control-label" style="color:red"> user ID Type </label>
		</div>
			<div class="col-5">
			<Select id="idtype" class="form-control" name="uidType">
			<option value="">select</option>
			<option value="pcard">Pan Card</option>
			<option value="acard">Adhar Card</option>
			<option value="acard">Others</option>
			</select>
            </div>
			</div>

	    <div class="row">
		<div class="col-2">
		<label ref="number" class="control-label" style="color:red">ID Number</label>
		</div>
			<div class="col-5">
			<input type="text" id="number" class="form-control" name="idNumber"/>
			</div>
			</div>

			<br>
		<center><input type="submit" value="Create User"  class="btn btn-success"/></center>
		</form>
		${msg}
		<a href="all"> ViewAll</a>
		</div>
		</div>
		</div>
		</BODY>
		</head>
		</html>

           
           
           

	 

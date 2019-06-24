<HTML>
 <HEAD>
  <TITLE>  uom register </TITLE>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
 </HEAD>

 <BODY>
   <div class="container">
 
       <div class="card"> 

          <div class="card-header bg-primary text-white">
		  <h3 style="style="color:red" >Welcome to uom register page </h3>
         </div>
     

	  <div class="card-body">
		 <form action="save" method="POST">
      
			
		<div class="row">
		<div class="col-3">
		<label ref="uomType" class="control-label" style="color:red">UomType</label>
		</div>
			<div class="col-4">
			<Select id="uomType" class="form-control" name="uomType">
			<option value="">Select</option>
			<option value="Packing">packing</option>
			<option value="NoPacking">No packing</option>
			</select>
			</div>
			</div>

		<div class="row">
		<div class="col-3">
		<label ref="uomModel" class="control-label" style="color:red">Uom Model</label>
		</div>
			<div class="col-4">
			<input type="text" id="uomModel" class="form-control" name="uomModel"/>
		</div>
		</div>

		<div class="row">
		<div class="col-3">
		<label ref="note" class="control-label"style="color:red">Discription</label>
		</div>
			<div class="col-4">
			<input type="textarea" id="note" class="form-control"  name="note"/>
		</div>
		</div>
		
		<br>
		<input type="submit" class="btn btn-primary" value="create uom"/>
       </form>
       ${msg} <br/>
<a href="all">View All</a>
       ${msg}
	   </div>
		</div>
		</div>
		</body>
		</html>

           
           
           
 
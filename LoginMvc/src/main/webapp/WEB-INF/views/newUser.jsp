<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

<script type="text/javascript">


function clickMe(){

	var empId = document.card.empNumber.value;
	var pass = document.card.password.value;
	var pa1=false;

	if(empId.length()==4){
		pa1=true;
	}
	else{
		pa1=false;
	}
var pa2=false;
	if(pass.length()==6){
		pa1=true;
	}
	else{
		pa1=false;
	}

	
	if(pa1 && pa2){
		return true;
	}
	else{
		alert("password should be 6 and empNumber should be 4")
		return false;

	}

</script>

</head>
<body>
<div class="col-md-6 offset-md-3">
<form onsubmit="return clickMe()" name="card"  action="processform" method="post">

<div class="card-header bg-dark text-white">
<h3>Registration form </h3>
</div>

<div class="card-body bg-secondary">
<div class="form-group">
<input name = "name" type="name" class="form-control" placeholder="Enter username" required="required">
</div>
<div class="form-group">
<input name="email" type="email" class="form-control" placeholder="Enter Email" required="required">
</div>

<div class="form-group">
<input name="password" type="password" class="form-control" placeholder="Enter password" required="required">
</div>

<div class="form-group">
<input name="empNumber" type="text" class="form-control" placeholder="Enter Emp number" required="required">
</div>


</div>
<div class="card-footer text-center bg-dark text-white">
<button type="submit" class="btn btn-outline-light">Register</button>
</div>

</form>
</div>


</body>
</html>
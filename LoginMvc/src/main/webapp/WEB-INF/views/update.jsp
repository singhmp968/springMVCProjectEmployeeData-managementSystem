<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="col-md-6 offset-md-3">
<form onsubmit="return clickMe()" name="card"  action="updateProcess" method="post">

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
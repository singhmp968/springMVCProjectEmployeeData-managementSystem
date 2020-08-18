<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	

<div class="container mt-3">
	<div class="row">
		<div class="col-md-6 offset-md-3">
			<h1 class="text-center mb-3">fill product details</h1>
				<form action="deleteProcess"> 	
					<div class="form-group">
						<label for="name">product id </label><input type="text"
						class="form-control" id="empNumber" 
						name="empNumber" placeholder="Enter the product Id you want to delete">
					
					</div>
					<button type="submit">Submit</button>
			</form>
		
		</div>
	</div>
</div>



</body>
</html>
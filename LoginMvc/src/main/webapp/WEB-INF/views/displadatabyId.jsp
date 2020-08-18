<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="./base.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<div class="col-md-12">
		
		<h1 class="text-center mb-3" >Welcome to Product App</h1>
		
		
							<table class="table">
					  <thead class="thead-dark">
					    <tr>
					      <th scope="col">Employee Number</th>
					      <th scope="col">Email</th>
					      <th scope="col">Name</th>
					     </tr>
					  </thead>
					  <tbody>
					  
					    <tr>
					      <th scope="row">${user.empNumber }</th>
					      <td>${user.name }</td>
					      <td>${user.email }</td>
					      
					      <td>
					      	
					      	
					      </td>
					    </tr>
				
					   
					 </tbody>
					</table>
				<div class="container text-center">
				 <a href="${pageContext.request.contextPath}/login">Back</a>
				</div>
		
		</div>
	</div>

</div>



</body>
</html>
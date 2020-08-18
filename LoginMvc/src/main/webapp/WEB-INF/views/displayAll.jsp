<%@include file="./base.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
    
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
					      <th scope="col">Price</th>
					     </tr>
					  </thead>
					  <tbody>
					  <c:forEach items="${user }" var="p">
					    <tr>
					      <th scope="row">${p.empNumber }</th>
					      <td>${p.name }</td>
					      <td>${p.email }</td>
					      
					      <td>
					      	
					      	
					      </td>
					    </tr>
					    </c:forEach>
					   
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

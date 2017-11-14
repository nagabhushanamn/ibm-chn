<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
	
	<div class="container">
		<div class="page-header">shop-product-catalog</div>
		
		<div class="panel panel-default">
			<div class="panel-heading"> All products </div>
			<div class="panel-body">
				<table class="table table-bordered">
				<c:forEach items="${products}" var="product">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>&#8377; ${product.price}</td>
						<td>${product.makeDate}</td>
						<td>${product.description}</td>
					</tr>
				</c:forEach>
				</table>
			</div>
		</div>
		
	</div>
	
</body>
</html>
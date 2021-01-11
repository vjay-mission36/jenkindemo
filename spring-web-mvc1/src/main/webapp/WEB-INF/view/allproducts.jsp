<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>All Products</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function onSelectINR() {
		alert("select INR");
	}

	function onSelectUSD() {
		alert("select USD");
	}
</script>

</head>
<body>
     <label>Select the currency:</label>
	<div class="dropdown">
		<select id="currency">
		   <option onselect="javascript:onSelectINR()">INR</option>
		   <option onselect="javascript:onSelectUSD()">USD</option>
		</select>
	</div>

	<div class="container">
		<h2>Products Information</h2>
		<c:choose>
			<c:when test="${mode == 'PROD_VIEW'}">
				<p>The list of available products:</p>
				<table class="table">
					<thead>
						<tr>
							<th>Name</th>
							<th>Prise</th>
							<th>Quantity</th>
							<th>Currency</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="product" items="${products}">
							<tr>
								<td>${product.name}</td>
								<td>${product.prise}</td>
								<td>${product.quantity}</td>
								<td>${product.currency}</td>
								<td><a href="/editproduct?id=${product.id}">Edit</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:when>
		</c:choose>

		<c:choose>
			<c:when test="${mode == 'PROD_EDIT'}">
				<h1>Product Edit Form</h1>
				<form class="form-horizontal" action="/saveproduct" method="POST">
					<div class="form-group">
						<input type="hidden" name="id" value="${product.id}" /> <label
							class="control-label col-sm-2" for="name">Name:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="name"
								value="${product.name}" placeholder="Name of the product"
								name="name">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="prise">Prise:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="prise"
								value="${product.prise}" placeholder="Prise of the Product"
								name="prise">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="quantity">Quantity:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="quantity"
								value="${product.quantity}"
								placeholder="Quantity of the Product" name="quantity">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="currency">Currency:</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="currency"
								value="${product.currency}"
								placeholder="Currency of the Product" name="currency">
						</div>
					</div>


					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Submit</button>
						</div>
					</div>
				</form>
			</c:when>
		</c:choose>

	</div>
</body>


</html>


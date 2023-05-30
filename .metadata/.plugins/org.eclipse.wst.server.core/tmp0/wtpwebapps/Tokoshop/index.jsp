<%@page import="com.singasutera.connection.DbConnection"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<title>Tokoshop</title>
<%@include file="bootstrap/css.jsp"%>
</head>

<body>
	<%@include file="bootstrap/navbar.jsp"%>

	<%
	out.print(DbConnection.getConnection());
	%>


	<div class="container">
		<div class="card-header my-3">All Products</div>
		<div class="row">
			<div class="col-md-3">
				<div class="card" style="width: 18rem;">
					<img src="..." class="card-img-top" alt="Card Image">
					<div class="card-body">
						<h5 class="card-title">Card title</h5>
						<h6 class="price">Price: Rp 123</h6>
						<h6 class="category">Category: something</h6>
						<div class="mt-3 d-flex justify-content-between">
							<a href="#" class="btn btn-primary">Add to Cart</a>
							<a href="#" class="btn btn-primary">Buy Now</a>
						</div>

					</div>
				</div>
			</div>
		</div>

	</div>
	<%@include file="bootstrap/popper-js.jsp"%>
</body>
</html>
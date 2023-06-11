<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<title>Cart</title>
<%@include file="bootstrap/css.jsp"%>
</head>
<body>
	<%@include file="bootstrap/navbar.jsp"%>
	<%@include file="bootstrap/popper-js.jsp"%>

	<div class="container">
		<div class="d-flex py-3">
			<h3>Cart</h3>
		</div>
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Product Name</th>
					<th scope="col">Category</th>
					<th scope="col">Price</th>
					<th scope="col">Buy Now</th>
					<th scope="col">Cancel???</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>nama produk</td>
					<td>kategorinya</td>
					<td>123rupiah</td>
					<td>
						<form class="form-inline" method="post" action="">
							<input class="form-input" type="hidden" name="id" value="1">
							<div class="form-group d-flex justify-content-between">
								<a class="btn btn-sm btn-decre" href="">
								<i class="fas fa-plus-square"></i></a>
								
								<input class="form-control"
									type="text" name="quantity" value="1" readonly>
									
								<a class="btn btn-sm btn-incre" href="">
								<i class="fas fa-minus-square"></i></a>
							</div>
						</form>
					</td>
				</tr>
			</tbody>
		</table>
		<div class="d-flex py-3">
			<h3>Total Price: whatever price</h3>
			<a class="mx-3 btn btn-primary" href="#">Check Out</a>
		</div>
	</div>
</body>
</html>
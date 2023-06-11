<%@page import="java.util.List"%>
<%@page import="com.singasutera.dao.ProductDao"%>
<%@page import="com.singasutera.connection.DbConnection"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
ProductDao productDao = new ProductDao(DbConnection.getConnection());
List<Product> products = productDao.findAll();
%>


<!doctype html>
<html lang="en">
<head>
<title>Tokoshop</title>
<%@include file="bootstrap/css.jsp"%>
<fmt:setLocale value="id_ID" />
</head>

<body>
	<%@include file="bootstrap/navbar.jsp"%>

	<%-- <%
	out.print(DbConnection.getConnection());
	%> --%>


	<div class="container">
		<div class="card-header my-3">All Products</div>
		<div class="row">
			<%
			if (!products.isEmpty()) {
				for (Product p : products) {
			%>
			<div class="col-md-3">
				<div class="card" style="width: 18rem;">
					<img src="product-images/<%=p.getImage()%>" class="card-img-top"
						alt="Card Image">
					<div class="card-body">
						<h5 class="card-title"><%=p.getName()%></h5>
						<h5 class="price">
							
							<fmt:formatNumber value="<%=p.getPrice()%>" type="currency" />
						</h5>
						<h6 class="category">
							Category:
							<%=p.getCategory()%></h6>
						<div class="mt-3 d-flex justify-content-between">
							<a href="#" class="btn btn-dark">Add to Cart</a> <a href="#"
								class="btn btn-primary">Buy Now</a>
						</div>

					</div>
				</div>
			</div>
			<%
				}
			}
			%>


		</div>
		<%@include file="bootstrap/popper-js.jsp"%>
</body>
</html>
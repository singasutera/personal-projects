<%@page import="com.singasutera.model.*"%>
<%	User userSession = (User) request.getSession().getAttribute("login-session"); %>

<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" href="index.jsp">Tokoshop</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarNavAltMarkup"
			aria-controls="navbarNavAltMarkup" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav ms-auto">
				<%if (userSession != null)   {%>
					<a class="nav-link disabled"> Welcome, <%out.print(userSession.getName());%>!</a>
				<%} %>
					<a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
					<a class="nav-link" href="cart.jsp">Cart</a>
				
				<%if (userSession != null)   {%>
					<a class="nav-link" href="orders.jsp">Orders</a>
					<a class="nav-link" href="user-logout">Logout</a>
				<%} else { %>
					<a class="nav-link" href="login.jsp">Login</a>
				<%} %>
			</div>
		</div>
	</div>
</nav>
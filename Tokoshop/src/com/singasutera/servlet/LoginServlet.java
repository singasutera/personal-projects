package com.singasutera.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.singasutera.connection.DbConnection;
import com.singasutera.dao.UserDao;
import com.singasutera.model.User;

@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=ISO-8859-1");
		
		try(PrintWriter out = response.getWriter()) {
			String username = request.getParameter("login-username");
			String password = request.getParameter("login-password");
			
			UserDao userDao = new UserDao(DbConnection.getConnection());
			User user = userDao.userLogin(username, password);
			
			if(user!=null) {
				request.getSession().setAttribute("login-session", user);
				response.sendRedirect("index.jsp");
			} else {
				out.print("gagal bos");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

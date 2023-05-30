package com.singasutera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.singasutera.model.User;

public class UserDao {
	private Connection connection;
	private String query;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public UserDao(Connection connection) {
		this.connection = connection;
	}
	
	public User userLogin(String username, String password) {
		User user = null;
		try {
			query = "SELECT * FROM login WHERE username=? AND password=?";
			preparedStatement = this.connection.prepareStatement(query);
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()) {
				user = new User();
				user.setUser_id(resultSet.getInt("user_id"));
				user.setName(resultSet.getString("name"));
				user.setPassword(resultSet.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		return user;
	}
}

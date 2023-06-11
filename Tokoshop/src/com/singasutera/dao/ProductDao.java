package com.singasutera.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.singasutera.model.Product;

public class ProductDao {
	private Connection connection;
	private String query;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public ProductDao(Connection connection) {
		this.connection = connection;
	}
	
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		
		try {
			query = "SELECT * FROM Products";
			preparedStatement = this.connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Product product = new Product();
				product.setId(resultSet.getInt("id"));
				product.setName(resultSet.getString("product_name"));
				product.setCategory(resultSet.getString("category"));
				product.setPrice(resultSet.getInt("price"));
				product.setImage(resultSet.getString("image"));
				
				products.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return products;
	}
}

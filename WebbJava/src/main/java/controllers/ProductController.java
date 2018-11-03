package controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import database.Config;
import database.ConfigReader;
import database.MySQLConnector;
import models.Product;

public class ProductController {
	Statement st;

	public ProductController() {
		ConfigReader cr = new ConfigReader();
		Config conf = cr.getConfig();
		MySQLConnector conn = new MySQLConnector(conf);
		st = conn.getStatement();
	}

	public List<Product> getProducts() {
		List<Product> list = new ArrayList<Product>();
		String sql = "SELECT * FROM products";
		try {
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getDouble("price"));
				product.setInfo(rs.getString("info").substring(0, 150));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public List<Product> getProductsByCategory(int category) {
		List<Product> list = new ArrayList<Product>();
		String sql = "SELECT * FROM products WHERE category="+category;
		try {
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getDouble("price"));
				product.setInfo(rs.getString("info").substring(0, 150));
				list.add(product);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	public Product getProductByID(int id) {
		Product product = null;
		String sql = "SELECT * FROM products WHERE id=" + id;
		try {
			ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
			    product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getDouble("price"));
				product.setInfo(rs.getString("info"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

}

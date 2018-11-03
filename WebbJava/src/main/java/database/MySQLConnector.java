package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnector {

	Statement st = null;
	Connection conn = null;

	public MySQLConnector(Config config) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://" + config.getAdress() + "?user=" + config.getLogin()
					+ "&password=" + config.getPassword());
			System.out.println("Connection ok...");
			st = conn.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		return st;
	}
}
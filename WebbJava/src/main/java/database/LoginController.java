package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.PasswordCoder;

public class LoginController {
private Statement st;

public LoginController(Statement st) {
	this.st = st;
}
public boolean login(String email,String password) {
	password = PasswordCoder.codePassword(password);
	String sql="SELECT * FROM users WHERE email='"+email+"' AND password='"+password+"'";
	
	try {
		ResultSet rs = st.executeQuery(sql);
		if(rs.next()) {
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}

public boolean register(String email, String password,String address, String name, String gender, String comment) {
	password = PasswordCoder.codePassword(password);
	String sql="INSERT INTO `users` (`email`, `password`, `address`, `name`, `gender`, `comment`) VALUES" +  
			"('"+email+"', '" + password + "', '" + address + "', '" + name + "', '"+gender+"', '"+comment+"');";
	String loginCheck="SELECT * FROM users WHERE email='"+email+"'";

	try {
		ResultSet rs = st.executeQuery(loginCheck);
		if(rs.next()) {
			return false;
		} else {
		 st.execute(sql);
			return true;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return false;
}
}

package com.google;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyWin extends JFrame{

    MyWin() {
        super("Maven project");
        URL urlImage1 = this.getClass().getClassLoader().getResource("images/1.jpg");
        URL urlImage2 = this.getClass().getClassLoader().getResource("images/news/2.jpg");
        ImageIcon icon1 = new ImageIcon(urlImage1);
        ImageIcon icon2 = new ImageIcon(urlImage2);

        JLabel label1 = new JLabel(icon1);
        JLabel label2 = new JLabel(icon2);
        JLabel label3=new JLabel (getFromDB());

        JPanel panel = new JPanel();
        
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        setSize(300,300);
        setVisible(true);
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    String getFromDB() {
    	String msg="";
    	try {
    		Class.forName("com.mysql.jdbc.Driver").newInstance();
    		Connection conn=null;
    		conn=DriverManager.getConnection("jdbc:mysql://localhost/Itea?"+"user=root&password=");
    		Statement stmt=null;
    		ResultSet rs=null;
    		stmt = conn.createStatement();
    		rs= stmt.executeQuery("SELECT * FROM users");
    		while (rs.next()) {
    			msg +=rs.getString("id") + "-" +rs.getString("name") + "-" +rs.getString("login");
    		}
    	}catch (Exception ex) {
    	}
    	return msg;
    		}
    	
    }


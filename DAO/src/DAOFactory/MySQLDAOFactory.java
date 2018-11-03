package DAOFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySQLDAOFactory extends DAOFactory{
  Statement st;
  
  
  public MySQLDAOFactory() {
    try {
      Class.forName("com.mysql.jdbc.Driver").newInstance();
      Connection conn = DriverManager.getConnection("jdbc:mysql://172.17.18.45/test?user=guest&password=");
      System.out.println("Connection ok...");
      st = conn.createStatement();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public CustomerDAO getCustomerDAO() {
    return new MySQLCustomerDAO(st);
  }

}
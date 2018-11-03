package DAOFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLCustomerDAO implements CustomerDAO{

  final String sqlSelect = "SELECT * FROM users WHERE id=";
  Statement st;
  
  public MySQLCustomerDAO(Statement st) {
    this.st = st;
  }

  @Override 
  public void addCustomer() {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void deleteCusomer(int id) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Customer findCustomer(int id) {
    Customer customer = null;
    try {
    ResultSet rs = st.executeQuery(sqlSelect+id);
    if(rs.next()) {
      customer = new Customer();
      customer.setId(1);
      customer.setAdress("somewhere");
      customer.setName("John");
    }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return customer;
  }
  
}
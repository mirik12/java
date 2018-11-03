package DAOFactory;

public abstract class DAOFactory {
  public abstract CustomerDAO getCustomerDAO();
  
  public static DAOFactory getDAOFactory(int id) {
	  switch(id) {
	  case 1: return new MySQLDAOFactory();
	  case 2: return new XMLDAOFactory();
	  default: 
		  return null;
	  }
  };
}
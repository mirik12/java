package DAOFactory;

public class XMLDAOFactory extends DAOFactory{

  @Override
  public CustomerDAO getCustomerDAO() {
    // TODO Auto-generated method stub
    return new XMLCustomerDAO();
  }

}
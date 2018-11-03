
package DAOFactory;

public interface CustomerDAO {
  void addCustomer();
  void deleteCusomer(int id);
  public Customer findCustomer(int id);
}
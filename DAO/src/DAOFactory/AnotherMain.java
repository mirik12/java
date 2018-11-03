package DAOFactory;

public class AnotherMain {

	public static void main(String[] args) {
		MySQLDAOFactory factory = new MySQLDAOFactory();
		MySQLCustomerDAO customerDAO= (MySQLCustomerDAO) factory.getCustomerDAO();
		Customer customer = customerDAO.findCustomer(1);
		System.out.println(customer);

	}

}

package DAOFactory;

public class DAOMain {

	public static void main(String[] args) {
		DAOFactory factory = DAOFactory.getDAOFactory(1);
		CustomerDAO customerDAO = factory.getCustomerDAO();
		Customer customer = customerDAO.findCustomer(1);
		System.out.println(customer);
		//customerDAO.addCustomer();
	}

}

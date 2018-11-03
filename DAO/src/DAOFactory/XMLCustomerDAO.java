package DAOFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class XMLCustomerDAO implements CustomerDAO{
  
  @Override
  public void addCustomer() {
    Customer customer = new Customer();
    customer.setId(2);
    customer.setAdress("xml");
    customer.setName("XML");
    XStream xstream = new XStream(new StaxDriver());
    try {
      xstream.toXML(customer,new FileOutputStream("customer.xml"));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void deleteCusomer(int id) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public Customer findCustomer(int id) {
    Customer customer = new Customer();
    XStream xstream = new XStream(new DomDriver());
    try {
      xstream.fromXML(new FileInputStream("customer.xml"),customer);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return customer;
  }

}
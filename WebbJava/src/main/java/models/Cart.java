package models;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<Product> list=new ArrayList<Product>();
	int listLength=0;
	public void addProduct(Product product) {
		list.add(product);
		
	}
	
	public List<Product> showCart() {
		
		return list;
	}

	public int getListLength() {
		return list.size();
	}

	
	
}

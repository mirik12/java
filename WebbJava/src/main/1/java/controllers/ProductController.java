package controllers;

import models.Product;

public class ProductController {
public Product getProduct() {
	Product product = new Product();
	product.setId(1);
	product.setInfo("bla-bla-bla");
	product.setName("noone");
	product.setPrice(0.0);
	return product;
}
}

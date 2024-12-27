package com.productapp.service;

import java.util.List;

import com.productapp.model.Product;

public interface IProductService {
	//inbuilt methods
	void addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(int productId);
	List<Product> getAllProduct();
	Product getById(int productId);
	
	//querying the database
	
}

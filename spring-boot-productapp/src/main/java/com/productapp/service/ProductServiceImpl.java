package com.productapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.model.Product;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductRepository productRepository;
	
	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		//check if productId is available
		//if so update the product
		//else create a new row
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
		}

	@Override
	public Product getById(int productId) {
		Optional<Product> productOpt=productRepository.findById(productId);
		if(productOpt.isPresent())
			return productOpt.get();
		return null;
	}

}

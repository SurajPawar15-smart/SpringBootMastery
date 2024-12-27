package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringBootProductappApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductappApplication.class, args);
	}

	@Autowired
	private IProductService productService;
	
	@Override
	public void run(String... args) throws Exception {
		Product product=new Product("Mobile","Samsung","Electronics",2000);
		//productService.addProduct(product);
		
		Product product1=new Product("Laptop","Dell","Electronics",20000);
		productService.addProduct(product1);
		
		productService.getAllProduct().forEach(System.out::println);
		
		System.out.println("By ID");
		Product nproduct=productService.getById(1);
		System.out.println(nproduct);
		
		System.out.println("Updating Product Data");
		nproduct.setPrice(9000);
		nproduct.setBrand("OnePlus");
		productService.updateProduct(nproduct);
		
		
		
		
		
		
	}

}

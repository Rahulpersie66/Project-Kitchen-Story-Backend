package com.spring.boot.kitchenstory.services;

import java.util.List;

import com.spring.boot.kitchenstory.entities.KitchenProduct;

public interface KitchenProductService {
	
	//add the product
	public boolean addProduct(KitchenProduct product);
	
	//show all LIST of PRoduct
	public List<KitchenProduct> getAllProducts();
	
	//get product by id
	public KitchenProduct getProductById(int productId);
	
	//update product by using prodId
	public KitchenProduct updateProductById(KitchenProduct product, int prodId);
	
	//delete the product by prodId
	public boolean deleteProductById(int prodId);
}

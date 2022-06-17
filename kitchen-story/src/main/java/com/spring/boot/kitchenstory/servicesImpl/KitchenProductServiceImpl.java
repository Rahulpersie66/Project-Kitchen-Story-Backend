package com.spring.boot.kitchenstory.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.kitchenstory.entities.KitchenProduct;
import com.spring.boot.kitchenstory.repositories.KitchenProductDao;
import com.spring.boot.kitchenstory.services.KitchenProductService;

@Service
public class KitchenProductServiceImpl implements KitchenProductService {
	
	@Autowired
	private KitchenProductDao productDao;
	
	//add the product
	@Override
	public boolean addProduct(KitchenProduct product) {
		productDao.save(product);
		return true;
	}

	//LIST of allProducts
	@Override
	public List<KitchenProduct> getAllProducts() {
		return productDao.findAll();
	}

	//get Product by Id
	@Override
	public KitchenProduct getProductById(int productId) {
		return productDao.findById(productId).get();
		}

	//Update the product using prodId
	@Override
	public KitchenProduct updateProductById(KitchenProduct product, int prodId) {
		KitchenProduct pro;
		pro=new KitchenProduct(prodId,product.getProdName(),product.getVendorName(),product.getPrice(),product.getImgUrl(),product.getProdDetail(),product.getType());
		productDao.save(pro);
		return pro;
	}

	@Override
	public boolean deleteProductById(int prodId) {
		boolean flag=false;
		KitchenProduct prod=productDao.findById(prodId).get();
		productDao.delete(prod);
		flag=true;
		return flag;
	}

}

package com.spring.boot.kitchenstory.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.kitchenstory.entities.KitchenOrderBooked;
import com.spring.boot.kitchenstory.entities.KitchenProduct;
import com.spring.boot.kitchenstory.entities.KitchenUserRegistered;
import com.spring.boot.kitchenstory.servicesImpl.KitchenOrderBookedServiceImpl;
import com.spring.boot.kitchenstory.servicesImpl.KitchenProductServiceImpl;
import com.spring.boot.kitchenstory.servicesImpl.KitchenUserServiceImpl;



@RestController
@CrossOrigin("*")
public class AdminController {
	
	@Autowired
	private KitchenUserServiceImpl userServiceImpl;
	@Autowired
	private KitchenProductServiceImpl productServiceImpl;
	@Autowired
	private KitchenOrderBookedServiceImpl orderserviceImpl;
	
	//add the sign up user
	@PostMapping("/admin/addedSignUpUser")
	public String addSignUser(@RequestBody  KitchenUserRegistered user)
	{	if(userServiceImpl.addUserSignUp(user))
			return "User added successfully";
		else
			return "some error occurred";
	}
	
	//get all the Signed up user
	@GetMapping("/admin/showAllUser")
	public List<KitchenUserRegistered> getAllUser(){
		return userServiceImpl.getAllUser();
	}
	
	//get user by id
	@GetMapping("/admin/changePassword/{user_id}")
	public KitchenUserRegistered getUser(@PathVariable int user_id) {
		return userServiceImpl.getUser(user_id);
		
	}
	
	//update the password
	@PutMapping("/admin/updatePassword/{user_id}")
	public KitchenUserRegistered updateUserPassword(@PathVariable int user_id,@RequestBody KitchenUserRegistered user) {
		return userServiceImpl.updateUserPassword(user_id, user) ;
	}
	
	//Add the product details to API
	@PostMapping("/admin/addProductDetails")
	public KitchenProduct addTheProduct(@RequestBody KitchenProduct product)
	{
		if(productServiceImpl.addProduct(product))
			return product;
		else
			return null;
	}
	
	//get Productby ID
	@GetMapping("/admin/product/{productID}")
	public KitchenProduct getProductById(@PathVariable int productID) {
		return productServiceImpl.getProductById(productID);
	}
	
	
	//get all the Products
	@GetMapping("/admin/showProducts")
	public List<KitchenProduct> getAllProducts(){
		return productServiceImpl.getAllProducts();
	}
	
	//update the product by productId
	@PutMapping("/admin/upadte/{productId}")
	public KitchenProduct updateProduct(@RequestBody KitchenProduct product,@PathVariable int productId) {
		return productServiceImpl.updateProductById(product, productId);
	}
	
	
	//Delete a product
	@DeleteMapping("/admin/deleteProduct/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		if(productServiceImpl.deleteProductById(productId))
		return "product is deleted";
		else
			return "not deleted";
	}
	
	//Order booked
	@PostMapping("/checkout/orderBooked")
	public KitchenOrderBooked bookOrder(@RequestBody KitchenOrderBooked order) {
		return orderserviceImpl.addOrder(order);
	}
	
	//get OrderId
	@GetMapping("/checkout/{orderId}")
	public KitchenOrderBooked getOneOrder(@PathVariable int orderId) {
		return orderserviceImpl.getOneOrder(orderId);
	}
	
	@PutMapping("/checkout/{orderId}")
	public KitchenOrderBooked updateOrderById(@PathVariable int orderId,@RequestBody KitchenOrderBooked order)
	{
		return orderserviceImpl.updateOrder(orderId, order);
	}
	
	@GetMapping("/allOrder")
	public List<KitchenOrderBooked> getAllOrder(){
		return orderserviceImpl.getAllOrder();
	}
}

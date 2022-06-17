package com.spring.boot.kitchenstory.services;
import java.util.List;

import com.spring.boot.kitchenstory.entities.KitchenOrderBooked;

public interface KitchenOrderBookedService {
	//to add the order booked
	
	public KitchenOrderBooked addOrder(KitchenOrderBooked order);
	
	//to get one order
	public KitchenOrderBooked getOneOrder(int orderId);
	
	//to update Order by id
	public KitchenOrderBooked updateOrder(int orderId,KitchenOrderBooked order);
	
	//getAll order list
	public List<KitchenOrderBooked> getAllOrder();
	
}

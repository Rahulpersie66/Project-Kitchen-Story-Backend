package com.spring.boot.kitchenstory.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.kitchenstory.entities.KitchenOrderBooked;
import com.spring.boot.kitchenstory.repositories.KitchenOrderBookedDao;
import com.spring.boot.kitchenstory.services.KitchenOrderBookedService;

@Service
public class KitchenOrderBookedServiceImpl implements KitchenOrderBookedService {
	
	@Autowired
	private KitchenOrderBookedDao orderDao;
	
	//adding the order in KitchenOrderServiceImpl
	@Override
	public KitchenOrderBooked addOrder(KitchenOrderBooked order) {
		//KitchenOrderBooked realOrder=new KitchenOrderBooked(order.getName(), order.getCompanyName(), order.getCountry(), order.getAddress(), order.getPostcode(), order.getEmail(), order.getPhone());
		orderDao.save(order);
		return order;
		
	}

	//to getone Order by id
	@Override
	public KitchenOrderBooked getOneOrder(int orderId) {
		return orderDao.findById(orderId).get();
	}

	//to update order by id
	@Override
	public KitchenOrderBooked updateOrder(int orderId, KitchenOrderBooked order) {
		KitchenOrderBooked newOrder=orderDao.findById(orderId).get();
		newOrder.setCardNumber(order.getCardNumber());
		return orderDao.save(newOrder);
	}

	@Override
	public List<KitchenOrderBooked> getAllOrder() {
		// TODO Auto-generated method stub
		return orderDao.findAll();
	}

}

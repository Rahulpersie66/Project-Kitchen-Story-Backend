package com.spring.boot.kitchenstory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="KitchenOrderBooked")
public class KitchenOrderBooked {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int orderId;
	
	@Column
	private String name;
	
	@Column
	private String country;
	
	@Column
	private String address;
	
	@Column
	private int postcode;
	
	@Column
	private String email;
	
	@Column
	private long phone;


	@Column
	private String productOrdered;
	
	@Column
	private double total;
	
	@Column
	private long cardNumber;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getProductOrdered() {
		return productOrdered;
	}

	public void setProductOrdered(String productOrdered) {
		this.productOrdered = productOrdered;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public KitchenOrderBooked(String name, String country, String address, int postcode, String email, long phone,
			String productOrdered, double total, long cardNumber) {
		super();
		this.name = name;
		this.country = country;
		this.address = address;
		this.postcode = postcode;
		this.email = email;
		this.phone = phone;
		this.productOrdered = productOrdered;
		this.total = total;
		this.cardNumber = cardNumber;
	}

	public KitchenOrderBooked() {
		super();
	}
	
	
}

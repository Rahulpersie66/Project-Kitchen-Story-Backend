package com.spring.boot.kitchenstory.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="KitchenUserRegistered")
public class KitchenUserRegistered {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email;
	private String fullName;
	private String password;
	private String address;
	private String cardType;
	private int cardNumber;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public KitchenUserRegistered() {
		super();
	}
	public KitchenUserRegistered(int id, String email, String fullName, String password, String address,
			String cardType, int cardNumber, String type) {
		super();
		this.id = id;
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.address = address;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
		this.type = type;
	}
	public KitchenUserRegistered(String email, String fullName, String password, String address) {
		super();
		this.email = email;
		this.fullName = fullName;
		this.password = password;
		this.address = address;
	}
	
	
	
	

	
}

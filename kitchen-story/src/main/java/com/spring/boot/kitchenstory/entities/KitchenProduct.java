package com.spring.boot.kitchenstory.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Kitchen_Product")
public class KitchenProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prodId;
	
	@Column
	private String prodName;
	
	@Column
	private String vendorName;
	
	@Column
	private double price;
	
	@Column
	private String imgUrl;
	
	@Column
	private String prodDetail;
	
	@Column
	private String type;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getProdDetail() {
		return prodDetail;
	}

	public void setProdDetail(String prodDetail) {
		this.prodDetail = prodDetail;
	}

	public KitchenProduct(int prodId, String prodName, String vendorName, double price, String imgUrl,
			String prodDetail, String type) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.vendorName = vendorName;
		this.price = price;
		this.imgUrl = imgUrl;
		this.prodDetail = prodDetail;
		this.type=type;
	}

	public KitchenProduct() {
		super();
	}
	
	
}

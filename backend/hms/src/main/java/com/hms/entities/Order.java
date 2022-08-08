package com.hms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "take_order")
public class Order {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String item;
	private int quantity;
	private int price;
	private int userId;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderId, String item, int quantity, int price, int userId) {
		super();
		this.orderId = orderId;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
		this.userId = userId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
}

package com.hms.services;

import java.util.List;

import com.hms.entities.Order;

public interface OrderService {

	Order createOrder(Order order);
	Order updateOrder(Order order);
	List<Order> getAllOrders();
	List<Order> getAllOrdersByUserId(int id);
	void deleteOrder(int id);

}

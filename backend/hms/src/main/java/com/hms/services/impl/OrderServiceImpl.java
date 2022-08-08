package com.hms.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entities.Order;
import com.hms.repositories.OrderRepo;
import com.hms.services.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	
	@Autowired
	private OrderRepo orderRepo;
	@Override
	public Order createOrder(Order order) {
		Order saveOrder = orderRepo.save(order);
		return saveOrder;
	}

	@Override
	public Order updateOrder(Order order) {
		Order updateOrder = orderRepo.save(order);
		return updateOrder;
	}

	@Override
	public List<Order> getAllOrders() {
		List<Order> orders = orderRepo.findAll();
		return orders;
	}

	@Override
	public List<Order> getAllOrdersByUserId(int id) {
		// TODO Auto-generated method stub
		List<Order> orders = orderRepo.findAllByUserId(id);
		return orders;
	}

	@Override
	public void deleteOrder(int id) {
		// TODO Auto-generated method stub
		 orderRepo.deleteById(id);
		
	}

}

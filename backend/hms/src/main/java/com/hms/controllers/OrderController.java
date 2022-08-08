package com.hms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entities.Order;
import com.hms.services.OrderService;

@RestController
@RequestMapping("api/order")
public class OrderController {

	@Autowired
	private OrderService orderService;
	@PostMapping("")
	public Order saveOrder(@RequestBody Order order) {
		return orderService.createOrder(order);
	}
	
	@PutMapping("")
	public Order updateOrder(@RequestBody Order order) {
		return orderService.updateOrder(order);
	}
	@GetMapping("")
	public List<Order> getAllOrder(){
		return orderService.getAllOrders();
	}
	@GetMapping("/{id}")
	public List<Order> getById(@PathVariable int id) {
		return orderService.getAllOrdersByUserId(id);
	}
	@DeleteMapping("/{id}")
	public void DeleteById(@PathVariable int id) {
		orderService.deleteOrder(id);
	}
}

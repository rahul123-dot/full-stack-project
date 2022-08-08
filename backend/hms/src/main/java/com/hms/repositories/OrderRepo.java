package com.hms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entities.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {

	List<Order> findAllByUserId(int id);

}

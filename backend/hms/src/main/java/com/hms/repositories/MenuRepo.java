package com.hms.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entities.Menu;

public interface MenuRepo extends JpaRepository<Menu, Integer>{

	List<Menu> getAllByCategory(String category);
	
}

package com.hms.services;

import java.util.List;

import com.hms.entities.Menu;

public interface MenuService {

	Menu save(Menu menu);
	List<Menu> getAllFood();
	Menu getById(int id);
	void deleteMenu(int id);
	List<Menu> category(String category);
	
}

package com.hms.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entities.Menu;
import com.hms.repositories.MenuRepo;
import com.hms.services.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	
	@Autowired
	private MenuRepo menuRepo;
	@Override
	public Menu save(Menu menu) {
		// TODO Auto-generated method stub
		Menu saveMenu = menuRepo.save(menu);
		return saveMenu;
	}

	@Override
	public List<Menu> getAllFood() {
		// TODO Auto-generated method stub
		List<Menu> foods = menuRepo.findAll();
		return foods;
	}

	@Override
	public Menu getById(int id) {
		// TODO Auto-generated method stub
		Optional<Menu> food = menuRepo.findById(id);
		Menu menu = food.get();
		return menu;
	}

	@Override
	public void deleteMenu(int id) {
		// TODO Auto-generated method stub
		menuRepo.deleteById(id);
		
	}

	@Override
	public List<Menu> category(String category) {
		// TODO Auto-generated method stub
		List<Menu> foodCategory = menuRepo.getAllByCategory(category);
		return foodCategory;
	}
	

}

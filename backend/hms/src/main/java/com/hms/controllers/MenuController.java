package com.hms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entities.Menu;

import com.hms.services.MenuService;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
 
	
	@Autowired
	private MenuService menuService;
	
	@PostMapping("")
	public Menu saveOrder(@RequestBody Menu menu){
	return 	menuService.save(menu);
		
	}
	@GetMapping
	public List<Menu> getAllMenu(){
		return menuService.getAllFood();
	}
	@GetMapping("/{id}")
	public Menu getById(@PathVariable int id) {
		return menuService.getById(id);
		}
	@GetMapping("/{category}")
	public List<Menu> foodCategory(@PathVariable String category){
		return menuService.category(category);
	}
	@PutMapping
	public Menu updateMenu(@RequestBody Menu menu) {
		return menuService.save(menu);
	}
	
	@DeleteMapping("/{id}")
	public void deleteMenu(@PathVariable int id ) {
		 menuService.deleteMenu(id);
	}
	
}

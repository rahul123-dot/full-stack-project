package com.hms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int menuId;
private String item;
private int price;
private String category;

public Menu(int menuId, String item, int price,String category) {
	super();
	this.menuId = menuId;
	this.item = item;
	this.price = price;
	this.category = category;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public int getMenuId() {
	return menuId;
}

public void setMenuId(int menuId) {
	this.menuId = menuId;
}

public String getItem() {
	return item;
}

public void setItem(String item) {
	this.item = item;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}


}

package com.hms.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.hms.entities.Role;

import lombok.Data;

@Entity
@Data
public class Role {

	@Id	
	private int id;
	
	private String name;
	
}

package com.hms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entities.Role;

public interface RoleRepo  extends JpaRepository<Role, Integer>{

}
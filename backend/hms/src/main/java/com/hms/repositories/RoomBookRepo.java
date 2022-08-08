package com.hms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entities.RoomBook;

public interface RoomBookRepo extends JpaRepository<RoomBook, Integer> {

}

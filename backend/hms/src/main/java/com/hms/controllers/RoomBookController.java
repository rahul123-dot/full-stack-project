package com.hms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.payloads.ApiResponse;
import com.hms.payloads.RoomBookDto;
import com.hms.services.RoomBookService;

@RestController
@RequestMapping("/api/roombooks")
public class RoomBookController {
///api/roombooks/
	
	@Autowired
	private RoomBookService roomBookService;
	
	//save Room
	@PostMapping("/")
	public ResponseEntity<RoomBookDto> saveRoom(@RequestBody RoomBookDto roomBookDto){
				RoomBookDto roomBookDto2=this.roomBookService.saveRoom(roomBookDto);
				return new ResponseEntity<>(roomBookDto,HttpStatus.CREATED);
	}
	//update room
	@PutMapping("/{bookid}")
	public ResponseEntity<RoomBookDto> updateRoom(@RequestBody RoomBookDto roomBookDto, @PathVariable Integer bookid){
		RoomBookDto updateRoomBookDto = this.roomBookService.updateRoom(roomBookDto, bookid);
		return ResponseEntity.ok(updateRoomBookDto);
	}
	//Delete- delete room
	@DeleteMapping("/{bookid}")
	public ResponseEntity<ApiResponse> deleteRoom(@PathVariable Integer bookid){
		this.roomBookService.deleteRoom(bookid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Room deleted sucessfully", true),HttpStatus.OK);
	}
	//Get- getallrooms
	@GetMapping("/")
	public ResponseEntity<List<RoomBookDto>> getAllRooms(){
		return ResponseEntity.ok(this.roomBookService.getAllRoom());
	}
	//Get- Get room by id
	@GetMapping("/{bookid}")
	public ResponseEntity<RoomBookDto> getRoomById(@PathVariable Integer bookid){
		return ResponseEntity.ok(this.roomBookService.getRoomById(bookid));
	}
}


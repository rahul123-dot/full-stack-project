package com.hms.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entities.RoomBook;
import com.hms.entities.User;
import com.hms.exceptions.ResourceNotFoundException;
import com.hms.payloads.RoomBookDto;
import com.hms.payloads.UserDto;
import com.hms.repositories.RoomBookRepo;
import com.hms.services.RoomBookService;
@Service
public class RoomBookServiceImpl implements RoomBookService{

	@Autowired
	private RoomBookRepo roomBookRepo;
	@Override
	public RoomBookDto saveRoom(RoomBookDto roomBookDto) {
	    RoomBook roomBook= this.dtoToRoomBook(roomBookDto);
	    if(roomBook.getType().equalsIgnoreCase("AC")) {
	    	roomBook.setAmmount(5000);
	    	roomBook.setPayed("yes");
	    }else {
	    	roomBook.setAmmount(3000);
	    	roomBook.setPayed("yes");
	    }
		RoomBook saveRoomBook = this.roomBookRepo.save(roomBook);
		return this.roomBookToDto(saveRoomBook);
	}

	@Override
	public RoomBookDto updateRoom(RoomBookDto roomBookDto, Integer bookId) {
		// TODO Auto-generated method stub
		RoomBook roomBook = this.roomBookRepo.findById(bookId)
				.orElseThrow(()->new ResourceNotFoundException("RoomBook", "Room Id",bookId));
		roomBook.setAmmount(roomBookDto.getAmmount());
		roomBook.setBookId(roomBookDto.getBookId());
		roomBook.setfName(roomBookDto.getfName());
	    roomBook.setInDate(roomBookDto.getInDate());
	    roomBook.setlName(roomBookDto.getlName());
	    roomBook.setLocation(roomBookDto.getLocation());
	    roomBook.setnOP(roomBookDto.getnOP());
//	    roomBook.setOrderNo(roomBookDto.getOrderNo());
	    roomBook.setOutDate(roomBookDto.getOutDate());
	    roomBook.setPayed(roomBookDto.getPayed());
	    roomBook.setType(roomBookDto.getType());
//	    roomBook.setUserName(roomBookDto.getUserName());
	    
	    RoomBook updateRoomBook = this.roomBookRepo.save(roomBook);
	    RoomBookDto roomBookDto1 = this.roomBookToDto(updateRoomBook);
		return roomBookDto1;
	}

	@Override
	public RoomBookDto getRoomById(Integer bookId) {
		// TODO Auto-generated method stub
		RoomBook roomBook = this.roomBookRepo.findById(bookId)
				.orElseThrow(()->new ResourceNotFoundException("RoomBook", "Room Id",bookId));
		return this.roomBookToDto(roomBook);
	}

	@Override
	public List<RoomBookDto> getAllRoom() {
		// TODO Auto-generated method stub
		List<RoomBook> RoomBooks = this.roomBookRepo.findAll();
		List<RoomBookDto> roomBookDtos = RoomBooks.stream().map(room->this.roomBookToDto(room)).collect(Collectors.toList());
		return roomBookDtos;
	}

	@Override
	public void deleteRoom(Integer bookId) {
		// TODO Auto-generated method stub
		RoomBook roomBook=this.roomBookRepo.findById(bookId)
				.orElseThrow(()->new ResourceNotFoundException("RoomBook","Room Id",bookId));
		this.roomBookRepo.delete(roomBook);
	}
	public RoomBook dtoToRoomBook(RoomBookDto roomBookDto) {
		RoomBook roomBook = new RoomBook();
		roomBook.setAmmount(roomBookDto.getAmmount());
		roomBook.setBookId(roomBookDto.getBookId());
		roomBook.setfName(roomBookDto.getfName());
	    roomBook.setInDate(roomBookDto.getInDate());
	    roomBook.setlName(roomBookDto.getlName());
	    roomBook.setLocation(roomBookDto.getLocation());
	    roomBook.setnOP(roomBookDto.getnOP());
//	    roomBook.setOrderNo(roomBookDto.getOrderNo());
	    roomBook.setOutDate(roomBookDto.getOutDate());
	    roomBook.setPayed(roomBookDto.getPayed());
	    roomBook.setType(roomBookDto.getType());
//	    roomBook.setUserName(roomBookDto.getUserName());
	    return roomBook;
	
	}
	public RoomBookDto roomBookToDto(RoomBook roomBook) {
		RoomBookDto roomBookDto = new RoomBookDto();
		roomBookDto.setAmmount(roomBook.getAmmount());
		roomBookDto.setBookId(roomBook.getBookId());
		roomBookDto.setfName(roomBook.getfName());
	    roomBookDto.setInDate(roomBook.getInDate());
	    roomBookDto.setlName(roomBook.getlName());
	    roomBookDto.setLocation(roomBook.getLocation());
	    roomBookDto.setnOP(roomBook.getnOP());
//	    roomBookDto.setOrderNo(roomBook.getOrderNo());
	    roomBookDto.setOutDate(roomBook.getOutDate());
	    roomBookDto.setPayed(roomBook.getPayed());
	    roomBookDto.setType(roomBook.getType());
//	    roomBookDto.setUserName(roomBook.getUserName());
	    return roomBookDto;
	}

}

package com.hms.services;

import java.util.List;

import com.hms.payloads.RoomBookDto;

public interface RoomBookService {
RoomBookDto saveRoom(RoomBookDto roomBookDto);
RoomBookDto updateRoom(RoomBookDto roomBookDto,Integer bookId);
RoomBookDto getRoomById(Integer bookId);
List<RoomBookDto> getAllRoom();
void deleteRoom(Integer bookId);
}

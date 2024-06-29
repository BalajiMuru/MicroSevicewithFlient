package com.hotelservice.service;

import java.util.List;

import com.hotelservice.entity.Hotel;

public interface HotelService {
	    //Create
		Hotel create(Hotel hotel);
		
		//getAll
		List<Hotel> getAll();
		
		//get single
		Hotel get(String id);
}

package com.hotelservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelservice.entity.Hotel;
import com.hotelservice.exception.ResourceNotFoundException;
import com.hotelservice.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService{

	@Autowired
	HotelRepository hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		String uid = UUID.randomUUID().toString();
		hotel.setId(uid);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		// TODO Auto-generated method stub
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("hotel id is not found"));
	}

}

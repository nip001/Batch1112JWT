package com.juaracoding.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.model.BookingModel;
import com.juaracoding.repository.BookingRepository;

@RestController
public class BookingController {

	@Autowired
	BookingRepository bookingRepository;

	@GetMapping("/")
	private List<BookingModel> getAll() {
		return bookingRepository.findAll();
	}
	
	@PostMapping("/")
	private String saveSemuaData(@RequestBody BookingModel model) {
		bookingRepository.save(model);
		return "Data berhasil disimpan";
	}
	
	@GetMapping("/nama/{firstname}")
	private List<BookingModel> getBookingByFirstName(@PathVariable("firstname") String name) {
		return bookingRepository.findBySeatIdRoomSeatIdMaxOfSeat(name);
	}
	
}

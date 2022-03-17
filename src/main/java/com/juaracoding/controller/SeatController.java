package com.juaracoding.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juaracoding.model.SeatModel;
import com.juaracoding.repository.SeatRepository;

@RestController
@RequestMapping("/seat")
public class SeatController {

	@Autowired
	SeatRepository seatRepository;
	
	@PostMapping("/")
	private String saveDataSeat(@RequestBody SeatModel model) {
		seatRepository.save(model);
		return "berhasil ditambahkan";
	}
}

package com.juaracoding.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juaracoding.model.BookingModel;
import com.juaracoding.model.CustomerCustomeGetNameModel;

public interface BookingRepository extends JpaRepository<BookingModel, Long>{
//	Select * from booking b join customer c on c.customer_id =b.customer_id where c.first_name="tessy"
	List<BookingModel> findByCustomerIdFirstName(String firstName);
	List<BookingModel> findByCustomerId_firstName(String firstName);
	List<BookingModel> findBySeatIdRoomSeatIdMaxOfSeat(String maxofseat);
	
}

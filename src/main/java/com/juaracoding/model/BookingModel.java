package com.juaracoding.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="booking")
public class BookingModel {
	//Nama : mantap, id:2
	//idbooking :1 ,idcustomer:2
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "customerId",referencedColumnName = "customerId",unique = true)
	private CustomerModel customerId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "seatId",referencedColumnName = "seatId",unique = true)
	private SeatModel seatId;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="screeningId",referencedColumnName = "screeningId")
	private ScreeningModel screeningId;
}

package com.juaracoding.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "screening")
public class ScreeningModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long screeningId;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "roomId",referencedColumnName = "roomId")
	private RoomModel roomId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "filmId",referencedColumnName = "filmId")
	private FilmModel filmId;
	
	private String screeningDate;
}

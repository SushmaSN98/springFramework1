package com.xworkz.places.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="places")
public class PlaceDTO {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="NAME")
	@NonNull
	private String name;
	
	
	@Column(name="LOCATION")
	@NonNull
	private String location;
	
	@Column(name="ENTRYFEES")
	@NonNull
	private int entryFees;
	
	

}

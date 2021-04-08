package com.xworkz.fooodDelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.fooodDelivery.constants.VendorrType;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="hotelvendor")
public class HotelVendorEntity {
	
	@Id
	@Column(name="hid")
	private int id;
	
	@Column(name="NAME")
	@NonNull
	private String name;
	
	@Column(name="LOCATION")
	@NonNull
	private String location;
	
	@Column(name="RATING")
	@NonNull
	private double rating;
	
	@Column(name="VENDORRTYPE")
	@NonNull
	private VendorrType type;
	
	

}

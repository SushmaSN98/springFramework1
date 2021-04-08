package com.xworkz.fooodDelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.fooodDelivery.constants.Gender;

import lombok.Data;
import lombok.NonNull;


@Data
@Entity
@Table(name="customer")
public class CustomerrEntity {
	@Id
	@Column(name="cid")
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
	
	@Column(name="PHONENO")
	@NonNull
	private long phoneNo;
	
	@Column(name="EMAIL")
	@NonNull
	private String email;
	
	@Column(name="GENDER")
	@NonNull
	private Gender gender;
	
	
	

}

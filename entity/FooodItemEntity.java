package com.xworkz.fooodDelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.fooodDelivery.constants.FooodType;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name="fooditem")
public class FooodItemEntity {
	
	@Id
	@Column(name="fid")
	private int id;
	@Column(name="NAME")
	@NonNull
	private String name;
	@Column(name="PRICE")
	@NonNull
	private double price;
	
	@Column(name="FOODTYPE")
	@NonNull
	private FooodType foodType;
	
	@Column(name="QUANTITY")
	@NonNull
	private int quantity;
	
	@Column(name="DISCOUNT")
	@NonNull
	private double discount;
	
	
	
	
	

	
	
	
	
}

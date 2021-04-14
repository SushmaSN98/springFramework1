package com.xworkz.shirt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="shirt")
public class ShirtDTO {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="COLOR")
	@NonNull
	private String color;
	
	@Column(name="COST")
	@NonNull
	private double cost;
	
	@Column(name="QUANTITY")
	@NonNull
	private int quantity;

}

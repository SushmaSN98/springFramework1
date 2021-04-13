package com.xworkz.application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="application")
public class ApplicationDTO {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="NAME")
	@NonNull
	private String name;
	@Column(name="EMAIL")
	@NonNull
	private String email;
	@Column(name="QUALIFICATION")
	@NonNull
	private String qualification;
	@Column(name="CONTACTNO")
	@NonNull
	private long contactNo;
	@Column(name="ADDRESS")
	@NonNull
	private String address;

}

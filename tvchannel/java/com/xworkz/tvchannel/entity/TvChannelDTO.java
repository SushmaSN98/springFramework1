package com.xworkz.tvchannel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NonNull;

@Data
@Entity
@Table(name="channel")
public class TvChannelDTO {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="NAME")
	@NonNull
	private String name;
	
	@Column(name="LANGUAGE")
	@NonNull
	private String language;

}

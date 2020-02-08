package com.example.pruebaApi.infrastructure.dto.myvet;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.pruebaApi.infrastructure.dto.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_db")
public class UserDbDTO extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	public UserDbDTO(Integer id, Boolean state, String document, String fristName, String lastName, String address,
			Double latitude, Double longitude) {
		super(id, state);
		this.document = document;
		this.fristName = fristName;
		this.lastName = lastName;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	//TODO ValueObject String 20
	private String document;
	
	//TODO ValueObject String 50
	private String fristName;

	//TODO ValueObject String 50
	private String lastName;

	//TODO ValueObject String 100
	private String address;
	
	//TODO ValueObject Double
	private Double latitude;
	
	//TODO ValueObject Double
	private Double longitude;
		
}

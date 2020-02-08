package com.example.pruebaApi.infrastructure.dto.myvet;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "user_db")
public class UserDbDTO 
{
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

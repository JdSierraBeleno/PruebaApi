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
@Table(name = "pet_type")
public class PetTypeDTO 
{
	private Integer id;
	
	//TODO ValueObject String 50 
	private String name;
}

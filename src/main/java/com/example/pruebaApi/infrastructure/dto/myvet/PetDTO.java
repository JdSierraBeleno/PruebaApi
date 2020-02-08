package com.example.pruebaApi.infrastructure.dto.myvet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Entity
@Table(name = "pet")
public class PetDTO 
{
	private Integer id;
	
	//TODO ValueObject String 50 
	private String name;
	
	//TODO ValueObject String 50 
	private String raza;
		
	//TODO ValueObject Date 
	private Date born;

	private String remarks;
	
	private String imagePath;
	
	@OneToOne(targetEntity = PetTypeDTO.class)
	private PetTypeDTO petType;
	
	@OneToOne(targetEntity = OwnerDTO.class)
	private OwnerDTO owner;
}

package com.example.pruebaApi.infrastructure.dto.myvet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.pruebaApi.infrastructure.dto.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "pet")
public class PetDTO extends BaseEntity
{
	private static final long serialVersionUID = 1L;

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
	
	public PetDTO(Integer id, Boolean state, String name, String raza, Date born, String remarks
				, String imagePath, PetTypeDTO petType, OwnerDTO owner) {
		super(id, state);
		this.name = name;
		this.raza = raza;
		this.born = born;
		this.remarks = remarks;
		this.imagePath = imagePath;
		this.petType = petType;
		this.owner = owner;
	}
}

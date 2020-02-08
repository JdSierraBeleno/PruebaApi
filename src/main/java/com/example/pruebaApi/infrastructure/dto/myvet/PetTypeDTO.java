package com.example.pruebaApi.infrastructure.dto.myvet;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.pruebaApi.infrastructure.dto.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "pet_type")
public class PetTypeDTO extends BaseEntity
{	
	private static final long serialVersionUID = 1L;

	public PetTypeDTO(Integer id, Boolean state, String name) {
		super(id, state);
		this.name = name;
	}

	//TODO ValueObject String 50 
	private String name;
}

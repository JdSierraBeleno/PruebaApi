package com.example.pruebaApi.infrastructure.dto.myvet;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "agend")
public class AgendDTO {

	private Integer id;
	
	private Boolean isAvailable;

	@ManyToOne(targetEntity = PetDTO.class)
	private PetDTO pet;
	
	private String remarks;
}

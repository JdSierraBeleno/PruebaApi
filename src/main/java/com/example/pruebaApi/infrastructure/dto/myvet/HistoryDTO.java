package com.example.pruebaApi.infrastructure.dto.myvet;

import java.util.Date;

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
@Table(name = "history")
public class HistoryDTO {

	private Integer id;
	
	//TODO ValueObject String 100 
	private String description;

	private String remarks;
	
	//TODO ValueObject Date 
	private Date date;
	
	@ManyToOne(targetEntity = ServiceTypeDTO.class)
	private ServiceTypeDTO serviceType;
	
	@ManyToOne(targetEntity = PetDTO.class)
	private PetDTO pet;
}

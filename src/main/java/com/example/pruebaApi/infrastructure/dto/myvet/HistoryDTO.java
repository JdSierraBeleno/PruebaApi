package com.example.pruebaApi.infrastructure.dto.myvet;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.pruebaApi.infrastructure.dto.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "history")
public class HistoryDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;

	//TODO ValueObject String 100 
	private String description;

	private String remarks;
	
	//TODO ValueObject Date 
	private Date date;
	
	@ManyToOne(targetEntity = ServiceTypeDTO.class)
	private ServiceTypeDTO serviceType;
	
	@ManyToOne(targetEntity = PetDTO.class)
	private PetDTO pet;
	
	public HistoryDTO(Integer id, Boolean state, String description, String remarks, Date date
					, ServiceTypeDTO serviceType, PetDTO pet) {
		super(id, state);
		this.description = description;
		this.remarks = remarks;
		this.date = date;
		this.serviceType = serviceType;
		this.pet = pet;
	}
}

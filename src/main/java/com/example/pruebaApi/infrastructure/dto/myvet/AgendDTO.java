package com.example.pruebaApi.infrastructure.dto.myvet;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.example.pruebaApi.infrastructure.dto.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "agend")
public class AgendDTO extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	private Boolean isAvailable;

	@ManyToOne(targetEntity = PetDTO.class)
	private PetDTO pet;
	
	private String remarks;
	
	public AgendDTO(Integer id, Boolean state,  Boolean isAvailable) {
		super(id, state);
		this.isAvailable = isAvailable;
	}
}

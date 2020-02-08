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
@Table(name = "agend_service_type")
public class AgendServiceTypeDTO extends BaseEntity
{
	private static final long serialVersionUID = 1L;

	//TODO ValueObject Date 
	private Date date;

	@ManyToOne(targetEntity = AgendDTO.class)
	private AgendDTO pet;

	@ManyToOne(targetEntity = ServiceTypeDTO .class)
	private ServiceTypeDTO  serviceType;
	
	public AgendServiceTypeDTO(Integer id, Boolean state, Date date, AgendDTO pet, ServiceTypeDTO  serviceType) {
		super(id, state);
		this.date = date;
		this.pet = pet;
		this.serviceType = serviceType;
	}
}

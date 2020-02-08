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
@Table(name = "agend_service_type")
public class AgendServiceTypeDTO 
{
	private Integer id;

	//TODO ValueObject Date 
	private Date date;

	@ManyToOne(targetEntity = AgendDTO.class)
	private AgendDTO pet;

	@ManyToOne(targetEntity = ServiceTypeDTO .class)
	private ServiceTypeDTO  serviceType ;

}

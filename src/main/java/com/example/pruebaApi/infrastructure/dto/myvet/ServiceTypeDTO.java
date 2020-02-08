package com.example.pruebaApi.infrastructure.dto.myvet;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.example.pruebaApi.infrastructure.dto.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "service_type")
public class ServiceTypeDTO extends BaseEntity 
{
	private static final long serialVersionUID = 1L;

	public ServiceTypeDTO(Integer id, Boolean state, String name) {
		super(id, state);
		this.name = name;
	}

	//TODO ValueObject String 50 
	private String name;
}

package com.example.pruebaApi.infrastructure.dto.myvet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "owner")
public class OwnerDTO 
{
	private Integer id;
	
	@OneToOne(targetEntity = UserDbDTO.class, cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
	private UserDbDTO user;
}

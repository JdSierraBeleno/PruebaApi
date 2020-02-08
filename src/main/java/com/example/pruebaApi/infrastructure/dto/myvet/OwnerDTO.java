package com.example.pruebaApi.infrastructure.dto.myvet;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.pruebaApi.infrastructure.dto.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "owner")
public class OwnerDTO  extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	@OneToOne(targetEntity = UserDbDTO.class, cascade = CascadeType.ALL,fetch =  FetchType.LAZY)
	private UserDbDTO user;
	
	public OwnerDTO(Integer id, Boolean state, UserDbDTO user) {
		super(id, state);
		this.user = user;
	}
}

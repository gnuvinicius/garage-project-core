package com.garage.core.models;

import java.time.LocalDateTime;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.MappedSuperclass;

import com.garage.core.enums.Status;

import lombok.Getter;

@Getter
@MappedSuperclass
public class ModelBase {

	@Enumerated(EnumType.ORDINAL)
	protected Status status;

	protected LocalDateTime criadoEm;
	protected LocalDateTime atualizadoEm;

}

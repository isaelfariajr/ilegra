package com.br.ilegra.MonitoringFiles.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class VendedorValorDTO {
	
	private String name;
	private BigDecimal value;  
	private Long idVenda;

}
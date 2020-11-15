package com.br.ilegra.MonitoringFiles.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class DadosVendaItensDTO {
	
	private Long idItem;
	private BigDecimal quantityItem;
	private BigDecimal price;

}
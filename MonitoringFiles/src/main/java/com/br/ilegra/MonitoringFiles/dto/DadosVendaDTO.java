package com.br.ilegra.MonitoringFiles.dto;

import java.util.List;

import lombok.Data;

@Data
public class DadosVendaDTO {

	private Long sale;
	private List<DadosVendaItensDTO> itens;
	private String salesmanName;
}

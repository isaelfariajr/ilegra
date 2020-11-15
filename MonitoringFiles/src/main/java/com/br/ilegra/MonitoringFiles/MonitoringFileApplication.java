package com.br.ilegra.MonitoringFiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//import com.br.ilegra.MonitoringFiles.service.FileProcessingService;

@SpringBootApplication
public class MonitoringFileApplication {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MonitoringFileApplication.class);
	}	
	
	public static void main(String[] args) {
		SpringApplication.run(MonitoringFileApplication.class, args);
	}

}

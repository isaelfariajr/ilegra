package com.br.ilegra.MonitoringFiles.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class MonitoringPathService {
	
	@Autowired
	private FileWatchService fileWatch;
	
	@Value("${monitoringfile.path_in}")
	private String path;
	
	@EventListener(ApplicationReadyEvent.class)
	public void processFile() {		
		fileWatch.startMonitoring(path);
	}
}

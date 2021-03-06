package com.br.ilegra.MonitoringFiles.service;

import java.nio.file.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import static java.nio.file.StandardWatchEventKinds.*;

import java.io.IOException;

@Service
public class FileWatchService {
	
	@Value("${monitoringfile.file}")
	private String file;
	
	@Autowired
	private FileProcessingService fileProcessing;
	
	 private void monitoring(String pPath) {
		 	try {
	            WatchService watcher = FileSystems.getDefault().newWatchService();

	            Path logDir = Paths.get(pPath);
	            logDir.register(watcher, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);

	            while (true) {
	                WatchKey key = watcher.take();
	                for (WatchEvent<?> event : key.pollEvents()) {
	                    WatchEvent.Kind<?> kind = event.kind();

	                    if (ENTRY_CREATE.equals(kind)) {
	                    	fileProcessing.read(pPath,file); 
	                    }    
	                }
	                key.reset();
	            }
	        } catch (IOException | InterruptedException e) {
	            e.printStackTrace();
	        }
	 }
	 
	 public void startMonitoring(String pPath) {
		 monitoring(pPath);
	 }
}

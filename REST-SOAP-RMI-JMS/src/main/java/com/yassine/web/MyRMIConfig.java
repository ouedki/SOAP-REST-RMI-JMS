package com.yassine.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import com.yassine.rmi.StudentRemoteService;

@Configuration
public class MyRMIConfig {

	@Bean
	@Autowired
	public RmiServiceExporter getRmiExporter(StudentRemoteService rmiService) {
		RmiServiceExporter exporter = new RmiServiceExporter();
		exporter.setRegistryPort(1099);
		exporter.setServiceName("STUDENT");
		exporter.setService(rmiService);
		return exporter;
	}
}

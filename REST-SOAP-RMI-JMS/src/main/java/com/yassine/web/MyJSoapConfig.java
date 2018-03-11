package com.yassine.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;

@Configuration
public class MyJSoapConfig {

	@Bean
	public SimpleJaxWsServiceExporter getJaxWs() {
		SimpleJaxWsServiceExporter exporter = new SimpleJaxWsServiceExporter();
		exporter.setBaseAddress("http://0.0.0.0:8585/service");
		return exporter;
	}
}

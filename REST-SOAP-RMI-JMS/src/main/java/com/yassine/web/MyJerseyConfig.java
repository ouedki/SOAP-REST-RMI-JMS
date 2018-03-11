package com.yassine.web;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyJerseyConfig {

	//@Bean
	public ResourceConfig getResourceConfig() {
		ResourceConfig resourceConfig = new ResourceConfig();
		resourceConfig.register(StudentRestService.class);
		return resourceConfig;
	}
}

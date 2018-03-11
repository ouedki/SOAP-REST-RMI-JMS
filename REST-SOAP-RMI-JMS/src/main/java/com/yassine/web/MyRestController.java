package com.yassine.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	@GetMapping("/sendMsg")
	public void sendMessage(@RequestParam String message) {
		jmsTemplate.convertAndSend("school.resp", message);
	}

}

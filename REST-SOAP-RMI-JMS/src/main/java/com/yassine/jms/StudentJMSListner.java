package com.yassine.jms;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.yassine.daos.StudentRepository;
import com.yassine.models.Student;

@Component
public class StudentJMSListner {
	@Autowired
	private StudentRepository studentRepository;
	
	@JmsListener(destination="studentQueue.queue")
	public void  receive(Message message) throws Exception {
		if (message instanceof TextMessage) {
			String msg = ((TextMessage) message).getText();
			System.out.println("*************************");
			System.out.println("Received Message: "+msg);
			System.out.println("*************************");
			Student student = new Student();
			String [] data = msg.split("_");
			String firstName = data[0];
			String lastName = data[1];
			String email = data[2];
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setEmail(email);
			studentRepository.save(student);
		}
	}

}

package com.yassine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yassine.daos.StudentRepository;
import com.yassine.daos.TrainingRepository;
import com.yassine.models.Student;
import com.yassine.models.Training;

@SpringBootApplication
public class RestSopaRmiJmsApplication implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TrainingRepository trainingRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(RestSopaRmiJmsApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
//		Training java = trainingRepository.save(new Training(null, "JAVA", 30 , null));
//		Training php = trainingRepository.save(new Training(null, "PHP", 25 , null));
//		Training angular = trainingRepository.save(new Training(null, "ANGULAR", 10 , null));
//		Training python = trainingRepository.save(new Training(null, "PYTHON", 10 , null));
//		
//		studentRepository.save(new Student(null, "ahmad", "lotfi", "ahmad@mail.com", java));
//		studentRepository.save(new Student(null, "yassine", "ouedki", "yassine@mail.com", php));
//		studentRepository.save(new Student(null, "amine", "oussou", "amine@mail.com", java));
//		studentRepository.save(new Student(null, "karam", "yakoubi", "karam@mail.com", python));
//		studentRepository.save(new Student(null, "kamal", "cherif", "kamal@mail.com", angular));
//		studentRepository.save(new Student(null, "najm", "marsil", "najm@mail.com", python));
	}
}

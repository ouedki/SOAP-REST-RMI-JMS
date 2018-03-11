package com.yassine.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yassine.daos.StudentRepository;
import com.yassine.models.Student;

//@RestController
public class StudentRestController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable Long id){
		return studentRepository.findOne(id);
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student s){
		return studentRepository.save(s);
	}
	
	@PutMapping("/students/{id}")
	public Student updateStudent(@PathVariable Long id,@RequestBody Student s){
		 s.setId(id);
		 return studentRepository.save(s);
	}
	
	@DeleteMapping("/students/{id}")
	public void deleteStudents(@PathVariable Long id){
		studentRepository.delete(id);
	}

}

package com.yassine.web;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yassine.daos.StudentRepository;
import com.yassine.models.Student;

@Component
@WebService
public class StudentSoapService {

	@Autowired
	StudentRepository studentRepository;

	@WebMethod
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}

	@WebMethod
	public Student getStudent(@WebParam(name="id") Long id){
		return studentRepository.findOne(id);
	}

	@WebMethod
	public Student saveStudent(@WebParam(name="student") Student s){
		return studentRepository.save(s);
	}

	@WebMethod
	public Student updateStudent(@WebParam(name="UserId") Long id, @WebParam(name="student") Student s){
		 s.setId(id);
		 return studentRepository.save(s);
	}
}

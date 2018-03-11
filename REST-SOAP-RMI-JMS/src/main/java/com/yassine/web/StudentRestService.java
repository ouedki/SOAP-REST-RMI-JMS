package com.yassine.web;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.yassine.daos.StudentRepository;
import com.yassine.models.Student;

@Component
@Path("/school")
public class StudentRestService {

	@Autowired
	StudentRepository studentRepository;
	
	@Path("/students")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	@Path("/students/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getAllStudents(@PathParam("id") Long id){
		return studentRepository.findOne(id);
	}
	
	@Path("/students")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Student saveStudent(Student s){
		return studentRepository.save(s);
	}
	
	@Path("/students/{id}")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public Student updateStudent(@PathParam("id") Long id, Student s){
		 s.setId(id);
		 return studentRepository.save(s);
	}
	
	@Path("/students/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteStudents(@PathParam("id") Long id){
		studentRepository.delete(id);
	}

}

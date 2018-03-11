package com.yassine.rmi.impl;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.daos.StudentRepository;
import com.yassine.models.Student;
import com.yassine.rmi.StudentRemoteService;

@Service
public class StudentRemoteServiceImpl implements StudentRemoteService{

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() throws RemoteException {
		return studentRepository.findAll();
	}

	@Override
	public Student getOneStudent(Long id) throws RemoteException {
		return studentRepository.findOne(id);
	}

	@Override
	public Student saveStudent(Student s) throws RemoteException {
		return studentRepository.save(s);
	}

	@Override
	public Student updateStudent(Long id, Student s) throws RemoteException {
		s.setId(id);
		return studentRepository.save(s);
	}

	@Override
	public void deleteStudent(Long id) throws RemoteException {
		studentRepository.delete(id);
	}

}

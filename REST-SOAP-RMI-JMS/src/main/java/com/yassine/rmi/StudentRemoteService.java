package com.yassine.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.yassine.models.Student;

public interface StudentRemoteService extends Remote{
	
	List<Student> getAllStudents() throws RemoteException; 
	Student getOneStudent(Long id) throws RemoteException; 
	Student saveStudent(Student s) throws RemoteException; 
	Student updateStudent(Long id, Student s) throws RemoteException; 
	void deleteStudent(Long id) throws RemoteException; 

}

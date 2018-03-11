package com.yassine.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.yassine.models.Training;

public interface TrainingtRemoteService extends Remote{
	
	List<Training> getAllTrainings() throws RemoteException; 
	Training getOneTraining(Long id) throws RemoteException; 
	Training saveTraining(Training s) throws RemoteException; 
	Training updateTraining(Long id, Training s) throws RemoteException; 
	void deleteTraining(Long id) throws RemoteException; 
}

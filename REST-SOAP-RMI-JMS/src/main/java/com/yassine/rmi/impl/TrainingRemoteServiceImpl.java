package com.yassine.rmi.impl;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yassine.daos.TrainingRepository;
import com.yassine.models.Student;
import com.yassine.models.Training;
import com.yassine.rmi.TrainingtRemoteService;

@Service
public class TrainingRemoteServiceImpl implements TrainingtRemoteService{

	@Autowired
	TrainingRepository trainingRepository;
	
	@Override
	public List<Training> getAllTrainings() throws RemoteException {
		return trainingRepository.findAll();
	}

	@Override
	public Training getOneTraining(Long id) throws RemoteException {
		return trainingRepository.findOne(id);
	}

	@Override
	public Training saveTraining(Training s) throws RemoteException {
		return trainingRepository.save(s);
	}

	@Override
	public Training updateTraining(Long id, Training s) throws RemoteException {
		s.setId(id);
		return trainingRepository.save(s);
	}

	@Override
	public void deleteTraining(Long id) throws RemoteException {
		trainingRepository.delete(id);
	}

}

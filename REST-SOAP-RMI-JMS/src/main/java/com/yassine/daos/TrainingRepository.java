package com.yassine.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.yassine.models.Training;

@RepositoryRestResource
public interface TrainingRepository extends JpaRepository<Training, Long>{
	Training findByName(String name);
}

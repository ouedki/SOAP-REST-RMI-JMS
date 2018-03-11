package com.yassine.daos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.yassine.models.Student;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long>{
	@RestResource(path="/byFN")
	Page<Student> findByFirstNameContains(@Param("fn") String fn, Pageable p);
}

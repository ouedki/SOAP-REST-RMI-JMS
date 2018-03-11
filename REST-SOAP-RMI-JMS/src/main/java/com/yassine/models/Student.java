package com.yassine.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student implements Serializable{

	private static final long serialVersionUID = 454356L;
	@Id @GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	@ManyToOne
	private Training training;
}

package com.yassine.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Training implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue
	private Long id;
	private String name;
	private int duration;
	@XmlTransient
	@JsonIgnore
	@OneToMany(mappedBy="training")
	private List<Student> students;
}

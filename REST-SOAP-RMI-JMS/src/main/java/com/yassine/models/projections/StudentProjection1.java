package com.yassine.models.projections;

import org.springframework.data.rest.core.config.Projection;

import com.yassine.models.Student;

@Projection(name="p1", types= {Student.class})
public interface StudentProjection1 {
	public String getFirstName();
	public String getLastName();
	public String getEmail();
}

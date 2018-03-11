package com.yassine.models.projections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.yassine.models.Student;

@Projection(name="p2", types= {Student.class})
public interface StudentProjectione {
	@Value("#{target.firstName} #{target.lastName}")
	String getFullName();
}

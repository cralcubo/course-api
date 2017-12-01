package com.christian.spring.boot.course;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	List<Course> findByTopicId(String id);

}

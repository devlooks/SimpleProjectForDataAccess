package com.skm.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skm.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
	
	// 네이밍 규칙 존재 findBy (조회 기준)
	List<Course> findByAuthor(String author);
	
	List<Course> findByName(String name);
}

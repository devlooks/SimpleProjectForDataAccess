package com.skm.springboot.learnjpaandhibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.skm.springboot.learnjpaandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void insert(Course course) {
		// dbTable = VO 맵핑
		entityManager.merge(course);
	}
	
	public Course findById(long id) {
		return entityManager.find(Course.class, id);
	}
	
	@Transactional
	public void deleteById(long id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	
}

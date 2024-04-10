package com.skm.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.skm.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.skm.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
// 	private CourseJdbcRepository repository;

//	@Autowired
// 	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		// JdbcTemplate, Jpa 사용
		repository.insert(new Course(1, "Learn AWS Now!", "skm"));
		repository.insert(new Course(2, "Learn Azure Now!", "skm"));
		repository.insert(new Course(3, "Learn DevOps Now!", "skm"));
		
		repository.deleteById(1);
		
		System.out.println(repository.findById(2));
		System.out.println(repository.findById(3));
		
		*/
		
		// springDataJpa 사용
		repository.save(new Course(1, "Learn AWS Now!", "skm"));
		repository.save(new Course(2, "Learn Azure Now!", "skm"));
		repository.save(new Course(3, "Learn DevOps Now!", "skm"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("skm"));
		
		System.out.println(repository.findByName("Learn Azure Now!"));
	}
}

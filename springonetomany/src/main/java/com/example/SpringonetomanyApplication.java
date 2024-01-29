package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.course;
import com.example.Entity.instructor;
import com.example.Repository.courseRepository;
import com.example.Repository.instructorrepository;

@SpringBootApplication
public class SpringonetomanyApplication implements CommandLineRunner {
	@Autowired
	private instructorrepository ir;
	@Autowired
	private courseRepository cr;

	public static void main(String[] args) {
		SpringApplication.run(SpringonetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		instructor i=new instructor();
		i.setEmail("deekshu@gmail.com");
		i.setName("deekshitha");
		course c=new course();
		c.setTitle("java");
		course c1=new course();
		c1.setTitle("spring boot");
		i.setCo(List.of(c,c1));
		c.setIn(i);
		c.setIn(i);
		cr.saveAll(List.of(c,c1));
		ir.save(i);
		
		
	}

}

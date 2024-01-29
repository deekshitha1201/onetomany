package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Entity.Comment;
import com.example.Entity.Post;
import com.example.Repository.Commentrepository;
import com.example.Repository.Postrepository;

@SpringBootApplication
public class OnetomanyuniApplication implements CommandLineRunner {
	@Autowired
	private Postrepository pr;
	@Autowired
	private Commentrepository cr;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyuniApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Post p=new Post("welcome", "springdatajpa");
		Comment c=new Comment("unidirection");
		Comment c1=new Comment("bidirection");
		p.getA().add(c);
		p.getA().add(c1);
		pr.save(p);
		System.out.println("hello");
	}

}

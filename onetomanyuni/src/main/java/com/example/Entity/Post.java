package com.example.Entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	private String description;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="p_id",referencedColumnName = "id")
	List<Comment> a=new ArrayList<>();
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Comment> getA() {
		return a;
	}
	public void setA(List<Comment> a) {
		this.a = a;
	}
	

}

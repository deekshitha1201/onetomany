package com.example.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class instructor {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	 private String name;
		private String email;
		@OneToMany(mappedBy = "in")
		private List<course> co;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<course> getCo() {
			return co;
		}
		public void setCo(List<course> co) {
			this.co = co;
		}
		


}

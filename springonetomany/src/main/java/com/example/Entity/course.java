package com.example.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String title;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name="instru_id")
		private instructor in;
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
		public instructor getIn() {
			return in;
		}
		public void setIn(instructor in) {
			this.in = in;
		}
		


}

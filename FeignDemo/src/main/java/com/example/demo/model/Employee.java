package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;



	@Entity
	public class Employee {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@NotBlank(message = "First name cannot be empty")
		private String first_name;
		private String last_name;

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Employee(int id, String first_name, String last_name) {
			super();
			this.id = id;
			this.first_name = first_name;
			this.last_name = last_name;
		}

		public Employee(String first_name, String last_name) {
			super();
			this.first_name = first_name;
			this.last_name = last_name;
		}

		public Integer getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + "]";
		}

}
package com;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Emp {

    @Id  //primary key
	@Column(name="id")    //table employee column is id is instance of class emp id
	private int id; 
 
	@Column(name="name")
	private String name;
	
	@Column(name="salary")    
	private double salary;
	
	@Column(name="doj")
	private LocalDate doj ;
	
	
	
	   
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

		public double getSalary() {
			return salary;
		}

		public void setSalary(double string) {
			this.salary = string;
		}

		public LocalDate getDoj() {
			return doj;
		}

		public void setDoj(LocalDate doj) {
			this.doj = doj;
		}

	
}

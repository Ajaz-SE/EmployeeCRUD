package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_Details")
public class Employee {
	  @Id
	  @Column(name = "Id")
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;
	  
	  @Column(name="First Name")
	   private String firstName;
	  
	  @Column(name="Last Name")
	   private String lastName;
	  
	  @Column(name="Email")
	   private String email;
	  
	  @Column(name="Age")
	   private int age;
	   
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Long id, String firstName, String lastName, String email, int age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	   
	   
}

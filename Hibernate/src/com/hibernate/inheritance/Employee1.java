package com.hibernate.inheritance;

import javax.persistence.*;


@Entity  
@Table(name = "employee1")  
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)   
public class Employee1 {
	@Id
	int id;
	
	@Column(name="name")
	String name;
	
	
	public Employee1() {
		super();
	}


	public Employee1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


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


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}	

}

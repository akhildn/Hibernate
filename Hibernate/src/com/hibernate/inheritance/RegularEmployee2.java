package com.hibernate.inheritance;

import javax.persistence.*;

@Entity  
@Table(name="regularemployee2")
@PrimaryKeyJoinColumn(name="ID") 
public class RegularEmployee2 extends Employee2{
	
	@Column(name="salary")
	float salary;

	
	public RegularEmployee2() {
		super();
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}

}

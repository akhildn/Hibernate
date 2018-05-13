package com.hibernate.inheritance;

import javax.persistence.*;

@Entity  
@DiscriminatorValue("regular") 
public class RegularEmployee extends Employee {
	
	@Column(name="salary")
	float salary;

	
	public RegularEmployee() {
		super();
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}

}

package com.hibernate.inheritance;

import javax.persistence.*;

@Entity  
@Table(name="regularemployee1")

@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
}) 
public class RegularEmployee1 extends Employee1 {
	
	@Column(name="salary")
	float salary;

	
	public RegularEmployee1() {
		super();
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}

}

package com.hibernate.annotation;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "emp_annotation") 
@NamedQueries(  
	    {  
	        @NamedQuery(  
	        name = "findRichEmployees",  
	        query = "from Employee e where e.salary > 4000"  
	        ),
	        @NamedQuery(  
	    	        name = "findAllEmployees",  
	    	        query = "from Employee"  
	    	        )
	    }  
	) 
public class Employee {
	@Id
	@GeneratedValue (strategy=GenerationType.SEQUENCE)
	int id;	
	@Column(name="firstname")
	String firstName;
	String lastName;
	float salary;
	
	
	public Employee() {
		super();
	}

	public Employee(int id, String firstName, String lastName, float salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

}

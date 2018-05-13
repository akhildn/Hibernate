package com.hibernate.relationship;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="rel_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE)
	int id;
	String name;
	
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="employee_id")
	List<Account> accounts;
	
	public Employee() {
		super();
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

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}	

	
}

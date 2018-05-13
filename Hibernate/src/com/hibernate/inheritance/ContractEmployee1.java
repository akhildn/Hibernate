package com.hibernate.inheritance;

import javax.persistence.*;


@Entity  
@Table(name="contractemployee1")

@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),  
    @AttributeOverride(name="name", column=@Column(name="name"))  
}) 
public class ContractEmployee1 extends Employee1 {
	
	@Column(name="hourly_rate")
	float hourlyRate;

	public ContractEmployee1() {
		super();
	}

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}	

}

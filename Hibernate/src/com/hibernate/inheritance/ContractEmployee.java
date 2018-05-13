package com.hibernate.inheritance;

import javax.persistence.*;


@Entity  
@DiscriminatorValue("contract") 

public class ContractEmployee extends Employee {
	
	@Column(name="hourly_rate")
	float hourlyRate;

	public ContractEmployee() {
		super();
	}

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}	

}

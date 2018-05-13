package com.hibernate.inheritance;

import javax.persistence.*;


@Entity  
@Table(name="contractemployee2")
@PrimaryKeyJoinColumn(name="ID")  
public class ContractEmployee2 extends Employee2 {
	
	@Column(name="hourly_rate")
	float hourlyRate;

	public ContractEmployee2() {
		super();
	}

	public float getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}	

}

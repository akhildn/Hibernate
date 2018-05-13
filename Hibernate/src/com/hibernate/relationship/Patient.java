package com.hibernate.relationship;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table (name="patient")
public class Patient {
	
	@Id
	
	int patient_id;
	String name;
	
	 @OneToMany(mappedBy = "patient")
	private Set<PatientDoctor> patientDoctors = new HashSet<PatientDoctor>();
	
	public Patient() {
		super();
	}

	public Patient(int patient_id, String name) {
		super();
		this.patient_id = patient_id;
		this.name = name;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public Set<PatientDoctor> getPatientDoctors() {
		return patientDoctors;
	}

	public void setPatientDoctors(Set<PatientDoctor> patientDoctors) {
		this.patientDoctors = patientDoctors;
	}

	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", name=" + name + "]";
	}
	
	

}

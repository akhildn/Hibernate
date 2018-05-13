package com.hibernate.relationship;

import java.util.*;

import javax.persistence.*;
@Entity
@Table (name="doctor")
public class Doctor {
	@Id
	
	int doctor_id;
	String name;
	
	 @OneToMany(mappedBy = "doctor")
	private Set<PatientDoctor> patientDoctors = new HashSet<PatientDoctor>();
	
	public Doctor() {
		super();
	}

	public Doctor(int doctor_id, String name) {
		super();
		this.doctor_id = doctor_id;
		this.name = name;
	}

	public int getDoctor_id() {
		return doctor_id;
	}

	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
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
		return "Doctor [doctor_id=" + doctor_id + ", name=" + name + "]";
	}

		
	
}

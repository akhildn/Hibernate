package com.hibernate.relationship;

import javax.persistence.*;

@Entity
@Table (name="patientdoctor")
public class PatientDoctor {
	@Id
	
	int relationid;
	
	@ManyToOne
    @JoinColumn(name = "doctor_id")
	Doctor doctor;
	
	@ManyToOne
    @JoinColumn(name = "patient_id")
	Patient patient;
	
	String status;
	
	public PatientDoctor() {
		super();
	}

	public PatientDoctor(int relationid, Doctor doctor, Patient patient, String status) {
		super();
		this.relationid = relationid;
		this.doctor = doctor;
		this.patient = patient;
		this.status = status;
	}

	public int getRelationid() {
		return relationid;
	}

	public void setRelationid(int relationid) {
		this.relationid = relationid;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "PatientDoctor [relationid=" + relationid + ", doctor=" + doctor + ", patient=" + patient + ", status="
				+ status + "]";
	}
	
	

}

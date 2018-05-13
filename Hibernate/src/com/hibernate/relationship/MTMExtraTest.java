package com.hibernate.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.ArrayList;

public class MTMExtraTest {

	public static void main(String[] args) {
		    
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml"); 	      
	      
	    SessionFactory factory=cfg.buildSessionFactory();	     
	    Session session=factory.openSession();	      
	     
	    Transaction t=session.beginTransaction();  
	          
	    Doctor doctor = new Doctor(2,"Sonia");
	    Patient patient = new Patient(5, "Amir");
	    PatientDoctor patientDoctor = new PatientDoctor();
	    patientDoctor.setRelationid(5);
	    patientDoctor.setDoctor(doctor);
	    patientDoctor.setPatient(patient);
	    patientDoctor.setStatus("A");
		
		session.save(doctor);
		session.save(patient);
	    session.save(patientDoctor);  
	    
	    t.commit(); 
	    session.close();     
	    factory.close();
	}

}

package com.hibernate.query;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.hibernate.relationship.Account;
import com.hibernate.relationship.Author;
import com.hibernate.relationship.Book;
import com.hibernate.relationship.Employee;
import com.hibernate.relationship.PatientDoctor;

public class HqlMTMExtraTest {

	public static void main(String[] args) {
		 	Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml"); 	      
		      
		    SessionFactory factory=cfg.buildSessionFactory();	     
		    Session session=factory.openSession();	      
		     
		    Transaction t=session.beginTransaction();
		    
		    Criteria c = session.createCriteria(PatientDoctor.class);
			  c.add(Restrictions.eq("doctor.doctor_id", 2));
			  c.add(Restrictions.eq("status", "A"));

			  List<PatientDoctor> doctorPatients = (List<PatientDoctor>) c.list();
		    
		    
		    for(PatientDoctor p : doctorPatients){
				System.out.println(p.getPatient().getName());				
			}         
		    
		    
		    t.commit(); 
		    session.close();     
		    factory.close();

	}

}

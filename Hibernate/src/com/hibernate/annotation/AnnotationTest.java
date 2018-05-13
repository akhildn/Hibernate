package com.hibernate.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnnotationTest {

	public static void main(String[] args) {
		    
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml"); 	      
	      
	    SessionFactory factory=cfg.buildSessionFactory();	     
	    Session session=factory.openSession();	      
	     
	    Transaction t=session.beginTransaction();  
	          
	    Employee e = new Employee();  
	    e.setId(5);  
	    e.setFirstName("Salman");  
	    e.setLastName("Khan"); 
	    e.setSalary(6000);	    
	      
	    session.save(e); 	    
	         
	    t.commit(); 
	    session.close();     
	    factory.close();
	}

}

package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		    
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml"); 	      
	      
	    SessionFactory factory=cfg.buildSessionFactory();	     
	    Session session=factory.openSession();	      
	     
	    Transaction t=session.beginTransaction();  
	          
	    Employee e = new Employee();  
	    e.setId(4);  
	    e.setFirstName("Salman");  
	    e.setLastName("Khan"); 
	    e.setSalary(10000);	    
	      
	    session.save(e); 
	    
	    
	    
	  /* Person p=new Person();
	    p.setName("Narendra Modi");
	    session.save(p);*/
	      
	    t.commit(); 
	    session.close();     
	    factory.close();
	}

}

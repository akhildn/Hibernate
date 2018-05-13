package com.hibernate.inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InheritanceTest {

	public static void main(String[] args) {
		    
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml"); 	      
	      
	    SessionFactory factory=cfg.buildSessionFactory();	     
	    Session session=factory.openSession();	      
	     
	    Transaction t=session.beginTransaction();  
	          
	    Employee e = new Employee();  
	    e.setId(1);  
	    e.setName("Sonia Gandhi");  
	    
	    RegularEmployee r = new RegularEmployee();
	    r.setId(2);
	    r.setName("Narendra Modi");
	    r.setSalary(10000);
	    
	    ContractEmployee c =new ContractEmployee();
	    c.setId(3);
	    c.setName("Amir Khan");
	    c.setHourlyRate(100);
	    
	    /*Employee1 e = new Employee1();  
	    e.setId(1);  
	    e.setName("Sonia Gandhi");  
	    
	    RegularEmployee1 r = new RegularEmployee1();
	    r.setId(2);
	    r.setName("Narendra Modi");
	    r.setSalary(10000);
	    
	    ContractEmployee1 c =new ContractEmployee1();
	    c.setId(3);
	    c.setName("Amir Khan");
	    c.setHourlyRate(100);*/
	    
/*	    Employee2 e = new Employee2();  
	    e.setId(1);  
	    e.setName("Sonia Gandhi");  
	    
	    RegularEmployee2 r = new RegularEmployee2();
	    r.setId(2);
	    r.setName("Narendra Modi");
	    r.setSalary(10000);
	    
	    ContractEmployee2 c =new ContractEmployee2();
	    c.setId(3);
	    c.setName("Amir Khan");
	    c.setHourlyRate(100);
*/	    
	      
	    session.save(e); 
	    session.save(r);
	    session.save(c);
	         
	    t.commit(); 
	    session.close();     
	    factory.close();
	}

}

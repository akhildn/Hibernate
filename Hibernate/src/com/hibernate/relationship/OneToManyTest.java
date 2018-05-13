package com.hibernate.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.ArrayList;

public class OneToManyTest {

	public static void main(String[] args) {
		    
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml"); 	      
	      
	    SessionFactory factory=cfg.buildSessionFactory();	     
	    Session session=factory.openSession();	      
	     
	    Transaction t=session.beginTransaction();  
	          
	    Employee e = new Employee();  
	    e.setId(2);  
	    e.setName("Amir"); 
	    
	    Account a1 = new Account();
	    a1.setAccountNo(9);
	    a1.setBankName("SBI");
	    
	    Account a2 = new Account();
	    a2.setAccountNo(10);
	    a2.setBankName("Axis");
	    
	    Account a3 = new Account();
	    a3.setAccountNo(11);
	    a3.setBankName("Citi");
	   
	    List<Account> accounts = new ArrayList<Account>();
	    accounts.add(a1);
	    accounts.add(a2);
	    accounts.add(a3);
	    
	    e.setAccounts(accounts);
	    
	      
	    session.save(e); 	    
	         
	    t.commit(); 
	    session.close();     
	    factory.close();
	}

}

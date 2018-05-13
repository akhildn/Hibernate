package com.hibernate.query;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.relationship.Account;
import com.hibernate.relationship.Employee;

public class HqlOTMRelationTest {

	public static void main(String[] args) {
		 	Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml"); 	      
		      
		    SessionFactory factory=cfg.buildSessionFactory();	     
		    Session session=factory.openSession();	      
		     
		    Transaction t=session.beginTransaction();
		    String qry=null;
		    qry = "from Employee"; 		     
		     
		    Query query = session.createQuery(qry);		    
		    
		    List<Employee> employees = query.getResultList();
		    
		    for(Employee emp : employees){
				System.out.println(emp.getName());
				List<Account> accounts = emp.getAccounts();
				for(Account ac : accounts){
					System.out.println(ac.getAccountNo() + "  "+ac.getBankName());					
				}
			}         
		    
		    
		    t.commit(); 
		    session.close();     
		    factory.close();

	}

}

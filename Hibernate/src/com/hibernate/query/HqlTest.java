package com.hibernate.query;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import com.hibernate.Employee;

public class HqlTest {

	public static void main(String[] args) {
		 	Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml"); 	      
		      
		    SessionFactory factory=cfg.buildSessionFactory();	     
		    Session session=factory.openSession();	      
		     
		    Transaction t=session.beginTransaction();
		    String qry=null;
		    //qry = "from Employee"; 
		     //qry = "from Employee where salary>8000 order by salary desc";
		    /*qry = "from Employee order by id desc";
		     
		     
		    Query query = session.createQuery(qry);	
		    
		    query.setFirstResult(2);
		    query.setMaxResults(2);
		    
		    
		    
		    List<Employee> employees = query.getResultList();
		    
		    for(Employee emp : employees){
				System.out.println(emp.toString());
			}*/
		         
		    /*qry = "select avg(salary) from Employee";
		    Query query = session.createQuery(qry);	
		    List<Float> list = query.getResultList();
		    System.out.println(list.get(0));*/
		    
		    qry = "select firstName, lastName from Employee";
		    Query query = session.createQuery(qry);
		    List<Object[]> employees = query.getResultList();
		    
		    for(Object[] emp : employees){
				System.out.println(emp[0]+" "+emp[1]);
			}
		    
		    t.commit(); 
		    session.close();     
		    factory.close();

	}

}

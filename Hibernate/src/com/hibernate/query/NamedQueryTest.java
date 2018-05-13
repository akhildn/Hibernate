package com.hibernate.query;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;


import com.hibernate.annotation.Employee;

public class NamedQueryTest {

	public static void main(String[] args) {
		 	Configuration cfg=new Configuration();  
		    cfg.configure("hql.cfg.xml"); 	      
		      
		    SessionFactory factory=cfg.buildSessionFactory();	     
		    Session session=factory.openSession();	      
		     
		    
			Query query = session.getNamedQuery("findRichEmployees");
			//Query query = session.getNamedQuery("findAllEmployees");
			
			List<Employee> employees = query.getResultList();
			for(Employee emp : employees){
				System.out.println(emp.toString());
			}
		     
		    session.close();     
		    factory.close();

	}

}

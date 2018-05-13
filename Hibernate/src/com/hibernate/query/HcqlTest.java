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


import com.hibernate.Employee;

public class HcqlTest {

	public static void main(String[] args) {
		 	Configuration cfg=new Configuration();  
		    cfg.configure("hql.cfg.xml"); 	      
		      
		    SessionFactory factory=cfg.buildSessionFactory();	     
		    Session session=factory.openSession();	      
		     
		    
			Criteria c = session.createCriteria(Employee.class);
			c.add(Restrictions.gt("id",2));
			c.addOrder(Order.asc("salary"));
			List<Employee> employees = c.list();
			for(Employee emp : employees){
				System.out.println(emp.toString());
			}
		     
		    session.close();     
		    factory.close();

	}

}

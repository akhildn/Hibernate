package com.hibernate.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.ArrayList;

public class ManyToManyTest {

	public static void main(String[] args) {
		    
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml"); 	      
	      
	    SessionFactory factory=cfg.buildSessionFactory();	     
	    Session session=factory.openSession();	      
	     
	    Transaction t=session.beginTransaction();  
	          
	    Author author1 =new Author();
		author1.setAuthorName("Author Name1");
		
		Author author2 = new Author();
		author2.setAuthorName("Author Name2");
		
		Author author3 = new Author();
		author3.setAuthorName("Author Name3");
		
		
		List authorList1 = new ArrayList();
		authorList1.add(author1);
		authorList1.add(author2);
		
		List authorList2 = new ArrayList();
		authorList2.add(author2);
		authorList2.add(author3);
		
		Book book1 = new Book();
		book1.setBookName("book Name1");
		book1.setAuthors(authorList1);
		
		Book book2 = new Book();
		book2.setBookName("book Name2");
		book2.setAuthors(authorList2);    
	      
	    session.save(book1); 	    
	    session.save(book2);  
	    
	    t.commit(); 
	    session.close();     
	    factory.close();
	}

}

package com.hibernate.query;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.relationship.Account;
import com.hibernate.relationship.Author;
import com.hibernate.relationship.Book;
import com.hibernate.relationship.Employee;

public class HqlMTMRelationTest {

	public static void main(String[] args) {
		 	Configuration cfg=new Configuration();  
		    cfg.configure("hibernate.cfg.xml"); 	      
		      
		    SessionFactory factory=cfg.buildSessionFactory();	     
		    Session session=factory.openSession();	      
		     
		    Transaction t=session.beginTransaction();
		    String qry=null;
		    qry = "from Book"; 		     
		     
		    Query query = session.createQuery(qry);		    
		    
		    List<Book> books = query.getResultList();
		    
		    for(Book b : books){
				System.out.println(b.getBookName());
				List<Author> authors = b.getAuthors();
				for(Author a : authors){
					System.out.println(a.getAuthorId() + "  "+a.getAuthorName());					
				}
			}         
		    
		    System.out.println("------------------------");	
		    
		    qry = "from Author"; 		     
		     
		     query = session.createQuery(qry);		    
		    
		    List<Author> authors = query.getResultList();
		    
		    for(Author a : authors){
				System.out.println(a.getAuthorName());
				List<Book> books1 = a.getBooks();
				for(Book b : books1){
					System.out.println(b.getBookId() + "  "+b.getBookName());					
				}
			} 
		    t.commit(); 
		    session.close();     
		    factory.close();

	}

}

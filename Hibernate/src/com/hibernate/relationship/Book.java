package com.hibernate.relationship;

import java.util.List;
import javax.persistence.*;

@Entity
public class Book {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	int bookId;
	String bookName;
	
	@ManyToMany(cascade=CascadeType.ALL)  
    @JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"), inverseJoinColumns=@JoinColumn(name="author_id"))
	List<Author> authors;

	public Book() {
		super();
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	 
	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	

}

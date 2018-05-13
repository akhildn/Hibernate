package com.hibernate.relationship;

import java.util.List;

import javax.persistence.*;

@Entity
public class Author {
	
	@Id  
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	int authorId;
	String authorName;
	
	@ManyToMany(cascade=CascadeType.ALL)  
    @JoinTable(name="author_book", joinColumns=@JoinColumn(name="author_id"), inverseJoinColumns=@JoinColumn(name="book_id"))
	List<Book> books;
	
	public Author() {
		super();
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	

}

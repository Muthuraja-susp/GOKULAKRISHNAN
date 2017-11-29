package org.bok;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "BOOK_DETAILS")
public class Book {	
	@Id
	private int id;
	private String title;
	private String author;
	private double price;
	private int isbnno;
	public Book(int id, String title, String author, double price, int isbnno) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbnno = isbnno;
	}
	public Book() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	
}

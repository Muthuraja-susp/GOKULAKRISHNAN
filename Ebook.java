package org.bok.e;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

import org.bok.Book;
@Entity
public class Ebook extends Book {
	private String downloadURL;
	private int sizeInMB;
	public String getDownloadURL() {
		return downloadURL;
	}
	public void setDownloadURL(String downloadURL) {
		this.downloadURL = downloadURL;
	}
	public int getSizeInMB() {
		return sizeInMB;
	}
	public void setSizeInMB(int sizeInMB) {
		this.sizeInMB = sizeInMB;
	}
	public Ebook(int id, String title, String author, double price, int isbnno, String downloadURL, int sizeInMB) {
		super(id, title, author, price, isbnno);
		this.downloadURL = downloadURL;
		this.sizeInMB = sizeInMB;
	}
	public Ebook() {
		// TODO Auto-generated constructor stub
	}

}

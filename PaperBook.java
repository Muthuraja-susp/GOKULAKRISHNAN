package org.bok.paper;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

import org.bok.Book;
@Entity
public class PaperBook extends Book {
		private double shippingWeight;
		private int inStock;
		

		public PaperBook() {
			super();
			// TODO Auto-generated constructor stub
		}
		public PaperBook(int id, String title, String author, double price, int isbnno) {
			super(id, title, author, price, isbnno);
			// TODO Auto-generated constructor stub
		}
		public double getShippingWeight() {
			return shippingWeight;
		}
		public void setShippingWeight(double shippingWeight) {
			this.shippingWeight = shippingWeight;
		}
		public int getInStock() {
			return inStock;
		}
		public void setInStock(int inStock) {
			this.inStock = inStock;
		}
}

package org.bok.solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

import org.bok.e.Ebook;
import org.bok.paper.PaperBook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solutions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 1;
		while (i != 0) {
			BufferedReader bf = new BufferedReader((new InputStreamReader(System.in)));
			System.out.println("enter 1 for ebook,enter 2 for paper_book");
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			int c = Integer.valueOf(bf.readLine());
			switch (c) {
			case 1:
				Ebook ebook = new Ebook();
				Session session = sf.openSession();
				session.beginTransaction();
				System.out.println("enter the id");
				ebook.setId(Integer.valueOf(bf.readLine()));
				System.out.println("enter the title");
				ebook.setTitle(bf.readLine());
				System.out.println("enter author name");
				ebook.setAuthor(bf.readLine());
				System.out.println("enter the price");
				ebook.setPrice(Double.valueOf(bf.readLine()));
				System.out.println("enter the isbnno");
				ebook.setIsbnno(Integer.valueOf(bf.readLine()));
				System.out.println("enter the Url");
				ebook.setDownloadURL(bf.readLine());
				System.out.println("enter the size");
				ebook.setSizeInMB(Integer.valueOf(bf.readLine()));
				session.save(ebook);
				session.getTransaction().commit();
				session.close();
				break;
			case 2:
				Session session1 = sf.openSession();
				session1.beginTransaction();
				PaperBook pbook = new PaperBook();
				System.out.println("enter the id");
				pbook.setId(Integer.valueOf(bf.readLine()));
				System.out.println("enter the title");
				pbook.setTitle(bf.readLine());
				System.out.println("enter author name");
				pbook.setAuthor(bf.readLine());
				System.out.println("enter the price");
				pbook.setPrice(Double.valueOf(bf.readLine()));
				System.out.println("enter the isbnno");
				pbook.setIsbnno(Integer.valueOf(bf.readLine()));
				System.out.println("enter the shippingweight");
				pbook.setShippingWeight(Double.valueOf(bf.readLine()));
				System.out.println("enter the stock");
				pbook.setInStock(Integer.valueOf(bf.readLine()));
				session1.save(pbook);
				session1.getTransaction().commit();
				session1.close();
				break;
			default:
				break;

			}
			
		}i++;

	}
}

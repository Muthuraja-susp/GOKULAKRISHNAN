package Task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Admin {

	public static void main(String args[]) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i=0;
		while(i<3)
		{
			session.beginTransaction();
		System.out.println("enter the bookname");
		String bookName = bf.readLine();
		System.out.println("enter author name");
		String authorName = bf.readLine();
		System.out.println("enter publisher name");
		String publisher = bf.readLine();
		Library library = new Library(0, bookName, authorName, publisher);
		System.out.println(library.getBookName()+""+library.getAuthorName()+""+library.getPublisher());
		session.save(library);
		session.getTransaction().commit();
		
	}
}
}
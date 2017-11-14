package Task;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Employee_Details")
public class Library {
	@Id
	@GeneratedValue
	@Column(name = "BOOK_NO")
	private int no;

	@Column(name = "BOOK_Name", length = 125, nullable = false)
	private String bookName;

	@Column(name = "AUTHOR_NAME")
	private String authorName;

	@Column(name = "PUBLISHER")
	private String publisher;

	@Transient
	private int availableBook;

	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getAvailableBook() {
		return availableBook;
	}

	public void setAvailableBook(int availableBook) {
		this.availableBook = availableBook;
	}
	public Library(int no,String bookName, String authorName, String publisher) {
		super();
		this.no = no;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.availableBook = availableBook;
	}
	
}
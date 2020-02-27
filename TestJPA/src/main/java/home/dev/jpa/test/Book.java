package home.dev.jpa.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_DB")
@NamedQueries(
		{
			@NamedQuery(name = "book.getAll", query = "SELECT b FROM Book b")
		}
		)
public class Book {
	@Id
	@Column(name="BOOK_ID")
	private int bookId;
	
	@Column(name="BOOK_NAME")
	private String bookName;
	
	@Column(name="PROTAGONIST_NAME")
	private String protagonistName;

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", protagonistName=" + protagonistName + "]";
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

	public String getProtagonistName() {
		return protagonistName;
	}

	public void setProtagonistName(String protagonistName) {
		this.protagonistName = protagonistName;
	}

	public Book() {
		super();
	}
	
	
}

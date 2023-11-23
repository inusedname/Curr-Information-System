/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
import java.io.Serializable;
public class Book extends Product implements Serializable {
	public Book() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_BOOK_BOOKCATEGORY) {
			this.bookcategory = (BookCategory) owner;
		}
		
		else if (key == ORMConstants.KEY_BOOK_AUTHORS) {
			this.authors = (Authors) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private Authors authors;
	
	private BookCategory bookcategory;
	
	private String publisherName;
	
	private int pages;
	
	private java.util.Date firstRelease;
	
	public void setPublisherName(String value) {
		this.publisherName = value;
	}
	
	public String getPublisherName() {
		return publisherName;
	}
	
	public void setPages(int value) {
		this.pages = value;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setFirstRelease(java.util.Date value) {
		this.firstRelease = value;
	}
	
	public java.util.Date getFirstRelease() {
		return firstRelease;
	}
	
	public void setBookcategory(BookCategory value) {
		if (bookcategory != null) {
			bookcategory.book.remove(this);
		}
		if (value != null) {
			value.book.add(this);
		}
	}
	
	public BookCategory getBookcategory() {
		return bookcategory;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Bookcategory(BookCategory value) {
		this.bookcategory = value;
	}
	
	private BookCategory getORM_Bookcategory() {
		return bookcategory;
	}
	
	public void setAuthors(Authors value) {
		if (authors != null) {
			authors.book.remove(this);
		}
		if (value != null) {
			value.book.add(this);
		}
	}
	
	public Authors getAuthors() {
		return authors;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Authors(Authors value) {
		this.authors = value;
	}
	
	private Authors getORM_Authors() {
		return authors;
	}
	
	public void getCategory() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void updateAuthors() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void updateCategory() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}

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
import org.orm.PersistentException;
public class BookProcessor {
	private int ID;
	
	private Integer price;
	
	private String publisherName;
	
	private int pages;
	
	private java.util.Date firstRelease;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setPrice(int value) {
		setPrice(Integer.valueOf(value));
	}
	
	public void setPrice(Integer value) {
		this.price = value;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPublisherName(String value) {
		this.publisherName = value;
	}
	
	public String getPublisherName() {
		return publisherName == null ? "" : publisherName;
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
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int bookcategory_bookCategoryID;
	
	public void setBookcategory_bookCategoryID(int value) {
		this.bookcategory_bookCategoryID = value;
	}
	
	public int getBookcategory_bookCategoryID() {
		return bookcategory_bookCategoryID;
	}
	
	private int authors_authorsID;
	
	public void setAuthors_authorsID(int value) {
		this.authors_authorsID = value;
	}
	
	public int getAuthors_authorsID() {
		return authors_authorsID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Book _book = BookDAO.loadBookByORMID(getID());
				if (_book!= null) {
					copyFromBean(_book);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				Book _book = BookDAO.createBook();
				copyToBean(_book);
				if (BookDAO.save(_book)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				Book _book= BookDAO.loadBookByORMID(getID());
				if (_book != null) {
					copyToBean(_book);
					if (BookDAO.save(_book)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				Book _book = BookDAO.loadBookByORMID(getID());
				if (_book != null && BookDAO.deleteAndDissociate(_book)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(Book _book) {
		setPrice(_book.getPrice());
		setPublisherName(_book.getPublisherName());
		setPages(_book.getPages());
		setFirstRelease(_book.getFirstRelease());
		setID(_book.getORMID());
		
		{
			BookCategory _bookCategory = _book.getBookcategory();
			if (_bookCategory != null) {
				setBookcategory_bookCategoryID(_bookCategory.getORMID());
			}
		}
		
		
		{
			Authors _authors = _book.getAuthors();
			if (_authors != null) {
				setAuthors_authorsID(_authors.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Book _book) {
		_book.setPrice(getPrice());
		_book.setPublisherName(getPublisherName());
		_book.setPages(getPages());
		_book.setFirstRelease(getFirstRelease());
		try  {
			BookCategory _bookcategory = BookCategoryDAO.loadBookCategoryByORMID(getBookcategory_bookCategoryID());
			_book.setBookcategory(_bookcategory);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Authors _authors = AuthorsDAO.loadAuthorsByORMID(getAuthors_authorsID());
			_book.setAuthors(_authors);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


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
public class BookCategoryProcessor {
	private int ID;
	
	private String name;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name == null ? "" : name;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				BookCategory _bookCategory = BookCategoryDAO.loadBookCategoryByORMID(getID());
				if (_bookCategory!= null) {
					copyFromBean(_bookCategory);
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
				BookCategory _bookCategory = BookCategoryDAO.createBookCategory();
				copyToBean(_bookCategory);
				if (BookCategoryDAO.save(_bookCategory)) {
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
				BookCategory _bookCategory= BookCategoryDAO.loadBookCategoryByORMID(getID());
				if (_bookCategory != null) {
					copyToBean(_bookCategory);
					if (BookCategoryDAO.save(_bookCategory)) {
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
				BookCategory _bookCategory = BookCategoryDAO.loadBookCategoryByORMID(getID());
				if (_bookCategory != null && BookCategoryDAO.deleteAndDissociate(_bookCategory)) {
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
	
	private void copyFromBean(BookCategory _bookCategory) {
		setName(_bookCategory.getName());
		setID(_bookCategory.getORMID());
	}
	
	private void copyToBean(BookCategory _bookCategory) {
		_bookCategory.setName(getName());
	}
	
}


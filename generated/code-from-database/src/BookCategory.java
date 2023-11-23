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
public class BookCategory implements Serializable {
	public BookCategory() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_BOOKCATEGORY_BOOK) {
			return ORM_book;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private String name;
	
	private java.util.Set ORM_book = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	private void setORM_Book(java.util.Set value) {
		this.ORM_book = value;
	}
	
	private java.util.Set getORM_Book() {
		return ORM_book;
	}
	
	public final BookSetCollection book = new BookSetCollection(this, _ormAdapter, ORMConstants.KEY_BOOKCATEGORY_BOOK, ORMConstants.KEY_BOOK_BOOKCATEGORY, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

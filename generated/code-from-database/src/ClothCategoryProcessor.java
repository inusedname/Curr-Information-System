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
public class ClothCategoryProcessor {
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
				ClothCategory _clothCategory = ClothCategoryDAO.loadClothCategoryByORMID(getID());
				if (_clothCategory!= null) {
					copyFromBean(_clothCategory);
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
				ClothCategory _clothCategory = ClothCategoryDAO.createClothCategory();
				copyToBean(_clothCategory);
				if (ClothCategoryDAO.save(_clothCategory)) {
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
				ClothCategory _clothCategory= ClothCategoryDAO.loadClothCategoryByORMID(getID());
				if (_clothCategory != null) {
					copyToBean(_clothCategory);
					if (ClothCategoryDAO.save(_clothCategory)) {
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
				ClothCategory _clothCategory = ClothCategoryDAO.loadClothCategoryByORMID(getID());
				if (_clothCategory != null && ClothCategoryDAO.deleteAndDissociate(_clothCategory)) {
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
	
	private void copyFromBean(ClothCategory _clothCategory) {
		setName(_clothCategory.getName());
		setID(_clothCategory.getORMID());
	}
	
	private void copyToBean(ClothCategory _clothCategory) {
		_clothCategory.setName(getName());
	}
	
}


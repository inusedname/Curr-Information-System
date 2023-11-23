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
public class ClothBrandProcessor {
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
	
	private int cloth_clothID;
	
	public void setCloth_clothID(int value) {
		this.cloth_clothID = value;
	}
	
	public int getCloth_clothID() {
		return cloth_clothID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				ClothBrand _clothBrand = ClothBrandDAO.loadClothBrandByORMID(getID());
				if (_clothBrand!= null) {
					copyFromBean(_clothBrand);
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
				ClothBrand _clothBrand = ClothBrandDAO.createClothBrand();
				copyToBean(_clothBrand);
				if (ClothBrandDAO.save(_clothBrand)) {
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
				ClothBrand _clothBrand= ClothBrandDAO.loadClothBrandByORMID(getID());
				if (_clothBrand != null) {
					copyToBean(_clothBrand);
					if (ClothBrandDAO.save(_clothBrand)) {
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
				ClothBrand _clothBrand = ClothBrandDAO.loadClothBrandByORMID(getID());
				if (_clothBrand != null && ClothBrandDAO.deleteAndDissociate(_clothBrand)) {
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
	
	private void copyFromBean(ClothBrand _clothBrand) {
		setName(_clothBrand.getName());
		setID(_clothBrand.getORMID());
		
		{
			Cloth _cloth = _clothBrand.getCloth();
			if (_cloth != null) {
				setCloth_clothID(_cloth.getORMID());
			}
		}
		
	}
	
	private void copyToBean(ClothBrand _clothBrand) {
		_clothBrand.setName(getName());
		try  {
			Cloth _cloth = ClothDAO.loadClothByORMID(getCloth_clothID());
			_clothBrand.setCloth(_cloth);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


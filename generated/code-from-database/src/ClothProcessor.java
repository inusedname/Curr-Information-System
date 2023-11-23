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
public class ClothProcessor {
	private int ID;
	
	private Integer price;
	
	private int size;
	
	private String color;
	
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
	
	public void setSize(int value) {
		this.size = value;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setColor(String value) {
		this.color = value;
	}
	
	public String getColor() {
		return color == null ? "" : color;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int brand_clothBrandID;
	
	public void setBrand_clothBrandID(int value) {
		this.brand_clothBrandID = value;
	}
	
	public int getBrand_clothBrandID() {
		return brand_clothBrandID;
	}
	
	private int category_clothCategoryID;
	
	public void setCategory_clothCategoryID(int value) {
		this.category_clothCategoryID = value;
	}
	
	public int getCategory_clothCategoryID() {
		return category_clothCategoryID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Cloth _cloth = ClothDAO.loadClothByORMID(getID());
				if (_cloth!= null) {
					copyFromBean(_cloth);
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
				Cloth _cloth = ClothDAO.createCloth();
				copyToBean(_cloth);
				if (ClothDAO.save(_cloth)) {
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
				Cloth _cloth= ClothDAO.loadClothByORMID(getID());
				if (_cloth != null) {
					copyToBean(_cloth);
					if (ClothDAO.save(_cloth)) {
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
				Cloth _cloth = ClothDAO.loadClothByORMID(getID());
				if (_cloth != null && ClothDAO.deleteAndDissociate(_cloth)) {
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
	
	private void copyFromBean(Cloth _cloth) {
		setPrice(_cloth.getPrice());
		setSize(_cloth.getSize());
		setColor(_cloth.getColor());
		setID(_cloth.getORMID());
		
		{
			ClothBrand _clothBrand = _cloth.getBrand();
			if (_clothBrand != null) {
				setBrand_clothBrandID(_clothBrand.getORMID());
			}
		}
		
		
		{
			ClothCategory _clothCategory = _cloth.getCategory();
			if (_clothCategory != null) {
				setCategory_clothCategoryID(_clothCategory.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Cloth _cloth) {
		_cloth.setPrice(getPrice());
		_cloth.setSize(getSize());
		_cloth.setColor(getColor());
		try  {
			ClothBrand _brand = ClothBrandDAO.loadClothBrandByORMID(getBrand_clothBrandID());
			_cloth.setBrand(_brand);
		}
		catch (PersistentException e) {
		}
		
		try  {
			ClothCategory _category = ClothCategoryDAO.loadClothCategoryByORMID(getCategory_clothCategoryID());
			_cloth.setCategory(_category);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


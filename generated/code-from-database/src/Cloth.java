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
public class Cloth extends Product implements Serializable {
	public Cloth() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CLOTH_BRAND) {
			this.brand = (ClothBrand) owner;
		}
		
		else if (key == ORMConstants.KEY_CLOTH_CATEGORY) {
			this.category = (ClothCategory) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private ClothCategory category;
	
	private int size;
	
	private String color;
	
	private ClothBrand brand;
	
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
		return color;
	}
	
	public void setBrand(ClothBrand value) {
		if (this.brand != value) {
			ClothBrand lbrand = this.brand;
			this.brand = value;
			if (value != null) {
				brand.setCloth(this);
			}
			if (lbrand != null && lbrand.getCloth() == this) {
				lbrand.setCloth(null);
			}
		}
	}
	
	public ClothBrand getBrand() {
		return brand;
	}
	
	public void setCategory(ClothCategory value) {
		if (category != null) {
			category.cloth.remove(this);
		}
		if (value != null) {
			value.cloth.add(this);
		}
	}
	
	public ClothCategory getCategory() {
		return category;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Category(ClothCategory value) {
		this.category = value;
	}
	
	private ClothCategory getORM_Category() {
		return category;
	}
	
	public void getClothBrand() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void updateClothBrand() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void getClothCategory() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void updateClothCategory() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}

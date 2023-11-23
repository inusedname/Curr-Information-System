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
public class ClothCategory implements Serializable {
	public ClothCategory() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CLOTHCATEGORY_CLOTH) {
			return ORM_cloth;
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
	
	private java.util.Set ORM_cloth = new java.util.HashSet();
	
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
	
	private void setORM_Cloth(java.util.Set value) {
		this.ORM_cloth = value;
	}
	
	private java.util.Set getORM_Cloth() {
		return ORM_cloth;
	}
	
	public final ClothSetCollection cloth = new ClothSetCollection(this, _ormAdapter, ORMConstants.KEY_CLOTHCATEGORY_CLOTH, ORMConstants.KEY_CLOTH_CATEGORY, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

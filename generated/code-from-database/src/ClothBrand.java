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
public class ClothBrand implements Serializable {
	public ClothBrand() {
	}
	
	private int ID;
	
	private Cloth cloth;
	
	private String name;
	
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
	
	public void setCloth(Cloth value) {
		if (this.cloth != value) {
			Cloth lcloth = this.cloth;
			this.cloth = value;
			if (value != null) {
				cloth.setBrand(this);
			}
			if (lcloth != null && lcloth.getBrand() == this) {
				lcloth.setBrand(null);
			}
		}
	}
	
	public Cloth getCloth() {
		return cloth;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

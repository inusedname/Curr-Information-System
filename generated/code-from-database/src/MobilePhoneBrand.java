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
public class MobilePhoneBrand implements Serializable {
	public MobilePhoneBrand() {
	}
	
	private int ID;
	
	private MobilePhone phone;
	
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
	
	public void setPhone(MobilePhone value) {
		if (this.phone != value) {
			MobilePhone lphone = this.phone;
			this.phone = value;
			if (value != null) {
				phone.setBrand(this);
			}
			if (lphone != null && lphone.getBrand() == this) {
				lphone.setBrand(null);
			}
		}
	}
	
	public MobilePhone getPhone() {
		return phone;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

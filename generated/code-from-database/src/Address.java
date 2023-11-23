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
public class Address implements Serializable {
	public Address() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ADDRESS_CUSTOMER) {
			this.customer = (Customer) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private Customer customer;
	
	private String city;
	
	private String detail;
	
	private String phone;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setDetail(String value) {
		this.detail = value;
	}
	
	public String getDetail() {
		return detail;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCustomer(Customer value) {
		if (customer != null) {
			customer.address.remove(this);
		}
		if (value != null) {
			value.address.add(this);
		}
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Customer(Customer value) {
		this.customer = value;
	}
	
	private Customer getORM_Customer() {
		return customer;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

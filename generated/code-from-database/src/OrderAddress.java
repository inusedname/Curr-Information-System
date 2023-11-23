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
public class OrderAddress implements Serializable {
	public OrderAddress() {
	}
	
	private int ID;
	
	private Shipment shipment;
	
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
	
	public void setShipment(Shipment value) {
		if (this.shipment != value) {
			Shipment lshipment = this.shipment;
			this.shipment = value;
			if (value != null) {
				shipment.setOrderAddress(this);
			}
			if (lshipment != null && lshipment.getOrderAddress() == this) {
				lshipment.setOrderAddress(null);
			}
		}
	}
	
	public Shipment getShipment() {
		return shipment;
	}
	
	public void fromAddrees(int Address) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

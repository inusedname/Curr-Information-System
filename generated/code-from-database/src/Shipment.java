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
public class Shipment implements Serializable {
	public Shipment() {
	}
	
	private int ID;
	
	private Orders order;
	
	private boolean isRabbit;
	
	private String status;
	
	private OrderAddress orderAddress;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setIsRabbit(boolean value) {
		this.isRabbit = value;
	}
	
	public boolean getIsRabbit() {
		return isRabbit;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setOrder(Orders value) {
		if (this.order != value) {
			Orders lorder = this.order;
			this.order = value;
			if (value != null) {
				order.setShipment(this);
			}
			if (lorder != null && lorder.getShipment() == this) {
				lorder.setShipment(null);
			}
		}
	}
	
	public Orders getOrder() {
		return order;
	}
	
	public void setOrderAddress(OrderAddress value) {
		if (this.orderAddress != value) {
			OrderAddress lorderAddress = this.orderAddress;
			this.orderAddress = value;
			if (value != null) {
				orderAddress.setShipment(this);
			}
			if (lorderAddress != null && lorderAddress.getShipment() == this) {
				lorderAddress.setShipment(null);
			}
		}
	}
	
	public OrderAddress getOrderAddress() {
		return orderAddress;
	}
	
	public void getAddress() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void updateAddress() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

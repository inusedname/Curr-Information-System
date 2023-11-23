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
public class Payment implements Serializable {
	public Payment() {
	}
	
	private int ID;
	
	private Orders orders;
	
	private int shipFee;
	
	private int productFee;
	
	private String status;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setShipFee(int value) {
		this.shipFee = value;
	}
	
	public int getShipFee() {
		return shipFee;
	}
	
	public void setProductFee(int value) {
		this.productFee = value;
	}
	
	public int getProductFee() {
		return productFee;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setOrders(Orders value) {
		if (this.orders != value) {
			Orders lorders = this.orders;
			this.orders = value;
			if (value != null) {
				orders.setPayment(this);
			}
			if (lorders != null && lorders.getPayment() == this) {
				lorders.setPayment(null);
			}
		}
	}
	
	public Orders getOrders() {
		return orders;
	}
	
	public void calcProductFee(int Cart) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void calcShipFee(int Cart, int Shipment) {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void getOrder() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

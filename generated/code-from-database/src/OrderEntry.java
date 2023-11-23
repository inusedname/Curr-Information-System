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
public class OrderEntry implements Serializable {
	public OrderEntry() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ORDERENTRY_ORDERS) {
			this.orders = (Orders) owner;
		}
		
		else if (key == ORMConstants.KEY_ORDERENTRY_PRODUCT) {
			this.product = (Product) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID2;
	
	private int ID;
	
	private int quantity;
	
	private Product product;
	
	private Orders orders;
	
	public void setQuantity(int value) {
		this.quantity = value;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	private void setID2(int value) {
		this.ID2 = value;
	}
	
	public int getID2() {
		return ID2;
	}
	
	public int getORMID() {
		return getID2();
	}
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setOrders(Orders value) {
		if (orders != null) {
			orders.orderEntrys.remove(this);
		}
		if (value != null) {
			value.orderEntrys.add(this);
		}
	}
	
	public Orders getOrders() {
		return orders;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Orders(Orders value) {
		this.orders = value;
	}
	
	private Orders getORM_Orders() {
		return orders;
	}
	
	public void setProduct(Product value) {
		if (product != null) {
			product.orderEntrys.remove(this);
		}
		if (value != null) {
			value.orderEntrys.add(this);
		}
	}
	
	public Product getProduct() {
		return product;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Product(Product value) {
		this.product = value;
	}
	
	private Product getORM_Product() {
		return product;
	}
	
	public String toString() {
		return String.valueOf(getID2());
	}
	
}

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
public class Customer extends Account implements Serializable {
	public Customer() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CUSTOMER_ORDER) {
			return ORM_order;
		}
		else if (key == ORMConstants.KEY_CUSTOMER_ADDRESS) {
			return ORM_address;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private String name;
	
	private String phone;
	
	private Cart cart;
	
	private java.util.Set ORM_order = new java.util.HashSet();
	
	private java.util.Set ORM_address = new java.util.HashSet();
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCart(Cart value) {
		if (this.cart != value) {
			Cart lcart = this.cart;
			this.cart = value;
			if (value != null) {
				cart.setCustomer(this);
			}
			if (lcart != null && lcart.getCustomer() == this) {
				lcart.setCustomer(null);
			}
		}
	}
	
	public Cart getCart() {
		return cart;
	}
	
	private void setORM_Order(java.util.Set value) {
		this.ORM_order = value;
	}
	
	private java.util.Set getORM_Order() {
		return ORM_order;
	}
	
	public final OrdersSetCollection order = new OrdersSetCollection(this, _ormAdapter, ORMConstants.KEY_CUSTOMER_ORDER, ORMConstants.KEY_ORDERS_CUSTOMER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Address(java.util.Set value) {
		this.ORM_address = value;
	}
	
	private java.util.Set getORM_Address() {
		return ORM_address;
	}
	
	public final AddressSetCollection address = new AddressSetCollection(this, _ormAdapter, ORMConstants.KEY_CUSTOMER_ADDRESS, ORMConstants.KEY_ADDRESS_CUSTOMER, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void getAddresses() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return super.toString();
	}
	
}

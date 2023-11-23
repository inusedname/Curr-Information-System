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
public class Cart implements Serializable {
	public Cart() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CART_CARTENTRYS) {
			return ORM_cartEntrys;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CART_CUSTOMER) {
			this.customer = (Customer) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private Customer customer;
	
	private java.util.Set ORM_cartEntrys = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCustomer(Customer value) {
		if (this.customer != value) {
			Customer lcustomer = this.customer;
			this.customer = value;
			if (value != null) {
				customer.setCart(this);
			}
			if (lcustomer != null && lcustomer.getCart() == this) {
				lcustomer.setCart(null);
			}
		}
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public Product[] getProducts() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = cartEntrys.getIterator();lIter.hasNext();) {
			lValues.add(((CartEntry)lIter.next()).getProduct());
		}
		return (Product[])lValues.toArray(new Product[lValues.size()]);
	}
	
	public void removeProduct(Product aProduct) {
		CartEntry[] lCartEntrys = cartEntrys.toArray();
		for(int i = 0; i < lCartEntrys.length; i++) {
			if(lCartEntrys[i].getProduct().equals(aProduct)) {
				cartEntrys.remove(lCartEntrys[i]);
			}
		}
	}
	
	public void addProduct(CartEntry aCartEntry, Product aProduct) {
		aCartEntry.setProduct(aProduct);
		cartEntrys.add(aCartEntry);
	}
	
	public CartEntry getCartEntryByProduct(Product aProduct) {
		CartEntry[] lCartEntrys = cartEntrys.toArray();
		for(int i = 0; i < lCartEntrys.length; i++) {
			if(lCartEntrys[i].getProduct().equals(aProduct)) {
				return lCartEntrys[i];
			}
		}
		return null;
	}
	
	private void setORM_CartEntrys(java.util.Set value) {
		this.ORM_cartEntrys = value;
	}
	
	private java.util.Set getORM_CartEntrys() {
		return ORM_cartEntrys;
	}
	
	public final CartEntrySetCollection cartEntrys = new CartEntrySetCollection(this, _ormAdapter, ORMConstants.KEY_CART_CARTENTRYS, ORMConstants.KEY_CARTENTRY_CART, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void getCartEntries() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

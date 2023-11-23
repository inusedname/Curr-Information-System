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
public class CartEntry implements Serializable {
	public CartEntry() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CARTENTRY_PRODUCT) {
			this.product = (Product) owner;
		}
		
		else if (key == ORMConstants.KEY_CARTENTRY_CART) {
			this.cart = (Cart) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private int quantity;
	
	private Cart cart;
	
	private Product product;
	
	public void setQuantity(int value) {
		this.quantity = value;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setProduct(Product value) {
		if (product != null) {
			product.cartEntrys.remove(this);
		}
		if (value != null) {
			value.cartEntrys.add(this);
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
	
	public void setCart(Cart value) {
		if (cart != null) {
			cart.cartEntrys.remove(this);
		}
		if (value != null) {
			value.cartEntrys.add(this);
		}
	}
	
	public Cart getCart() {
		return cart;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cart(Cart value) {
		this.cart = value;
	}
	
	private Cart getORM_Cart() {
		return cart;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

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
public abstract class Product implements Serializable {
	public Product() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PRODUCT_ORDERENTRYS) {
			return ORM_orderEntrys;
		}
		else if (key == ORMConstants.KEY_PRODUCT_CARTENTRYS) {
			return ORM_cartEntrys;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int ID;
	
	private Integer price;
	
	private java.util.Set ORM_orderEntrys = new java.util.HashSet();
	
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
	
	public void setPrice(int value) {
		setPrice(Integer.valueOf(value));
	}
	
	public void setPrice(Integer value) {
		this.price = value;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public Orders[] getOrderss() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = orderEntrys.getIterator();lIter.hasNext();) {
			lValues.add(((OrderEntry)lIter.next()).getOrders());
		}
		return (Orders[])lValues.toArray(new Orders[lValues.size()]);
	}
	
	public void removeOrders(Orders aOrders) {
		OrderEntry[] lOrderEntrys = orderEntrys.toArray();
		for(int i = 0; i < lOrderEntrys.length; i++) {
			if(lOrderEntrys[i].getOrders().equals(aOrders)) {
				orderEntrys.remove(lOrderEntrys[i]);
			}
		}
	}
	
	public void addOrders(OrderEntry aOrderEntry, Orders aOrders) {
		aOrderEntry.setOrders(aOrders);
		orderEntrys.add(aOrderEntry);
	}
	
	public OrderEntry getOrderEntryByOrders(Orders aOrders) {
		OrderEntry[] lOrderEntrys = orderEntrys.toArray();
		for(int i = 0; i < lOrderEntrys.length; i++) {
			if(lOrderEntrys[i].getOrders().equals(aOrders)) {
				return lOrderEntrys[i];
			}
		}
		return null;
	}
	
	private void setORM_OrderEntrys(java.util.Set value) {
		this.ORM_orderEntrys = value;
	}
	
	private java.util.Set getORM_OrderEntrys() {
		return ORM_orderEntrys;
	}
	
	public final OrderEntrySetCollection orderEntrys = new OrderEntrySetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCT_ORDERENTRYS, ORMConstants.KEY_ORDERENTRY_PRODUCT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public Cart[] getCarts() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = cartEntrys.getIterator();lIter.hasNext();) {
			lValues.add(((CartEntry)lIter.next()).getCart());
		}
		return (Cart[])lValues.toArray(new Cart[lValues.size()]);
	}
	
	public void removeCart(Cart aCart) {
		CartEntry[] lCartEntrys = cartEntrys.toArray();
		for(int i = 0; i < lCartEntrys.length; i++) {
			if(lCartEntrys[i].getCart().equals(aCart)) {
				cartEntrys.remove(lCartEntrys[i]);
			}
		}
	}
	
	public void addCart(CartEntry aCartEntry, Cart aCart) {
		aCartEntry.setCart(aCart);
		cartEntrys.add(aCartEntry);
	}
	
	public CartEntry getCartEntryByCart(Cart aCart) {
		CartEntry[] lCartEntrys = cartEntrys.toArray();
		for(int i = 0; i < lCartEntrys.length; i++) {
			if(lCartEntrys[i].getCart().equals(aCart)) {
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
	
	public final CartEntrySetCollection cartEntrys = new CartEntrySetCollection(this, _ormAdapter, ORMConstants.KEY_PRODUCT_CARTENTRYS, ORMConstants.KEY_CARTENTRY_PRODUCT, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}

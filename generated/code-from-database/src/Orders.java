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
public class Orders implements Serializable {
	public Orders() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ORDERS_ORDERENTRYS) {
			return ORM_orderEntrys;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ORDERS_CUSTOMER) {
			this.customer = (Customer) owner;
		}
		
		else if (key == ORMConstants.KEY_ORDERS_SHIPMENT) {
			this.shipment = (Shipment) owner;
		}
		
		else if (key == ORMConstants.KEY_ORDERS_PAYMENT) {
			this.payment = (Payment) owner;
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
	
	private int ID2;
	
	private Customer customer;
	
	private int ID;
	
	private int shipFee;
	
	private String paymentDetail;
	
	private int cartFee;
	
	private String status;
	
	private Shipment shipment;
	
	private java.util.Set ORM_orderEntrys = new java.util.HashSet();
	
	private Payment payment;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setShipFee(int value) {
		this.shipFee = value;
	}
	
	public int getShipFee() {
		return shipFee;
	}
	
	public void setPaymentDetail(String value) {
		this.paymentDetail = value;
	}
	
	public String getPaymentDetail() {
		return paymentDetail;
	}
	
	public void setCartFee(int value) {
		this.cartFee = value;
	}
	
	public int getCartFee() {
		return cartFee;
	}
	
	public void setStatus(String value) {
		this.status = value;
	}
	
	public String getStatus() {
		return status;
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
	
	public void setCustomer(Customer value) {
		if (customer != null) {
			customer.order.remove(this);
		}
		if (value != null) {
			value.order.add(this);
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
	
	public void setShipment(Shipment value) {
		if (this.shipment != value) {
			Shipment lshipment = this.shipment;
			this.shipment = value;
			if (value != null) {
				shipment.setOrder(this);
			}
			if (lshipment != null && lshipment.getOrder() == this) {
				lshipment.setOrder(null);
			}
		}
	}
	
	public Shipment getShipment() {
		return shipment;
	}
	
	public Product[] getProducts() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = orderEntrys.getIterator();lIter.hasNext();) {
			lValues.add(((OrderEntry)lIter.next()).getProduct());
		}
		return (Product[])lValues.toArray(new Product[lValues.size()]);
	}
	
	public void removeProduct(Product aProduct) {
		OrderEntry[] lOrderEntrys = orderEntrys.toArray();
		for(int i = 0; i < lOrderEntrys.length; i++) {
			if(lOrderEntrys[i].getProduct().equals(aProduct)) {
				orderEntrys.remove(lOrderEntrys[i]);
			}
		}
	}
	
	public void addProduct(OrderEntry aOrderEntry, Product aProduct) {
		aOrderEntry.setProduct(aProduct);
		orderEntrys.add(aOrderEntry);
	}
	
	public OrderEntry getOrderEntryByProduct(Product aProduct) {
		OrderEntry[] lOrderEntrys = orderEntrys.toArray();
		for(int i = 0; i < lOrderEntrys.length; i++) {
			if(lOrderEntrys[i].getProduct().equals(aProduct)) {
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
	
	public final OrderEntrySetCollection orderEntrys = new OrderEntrySetCollection(this, _ormAdapter, ORMConstants.KEY_ORDERS_ORDERENTRYS, ORMConstants.KEY_ORDERENTRY_ORDERS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setPayment(Payment value) {
		if (this.payment != value) {
			Payment lpayment = this.payment;
			this.payment = value;
			if (value != null) {
				payment.setOrders(this);
			}
			if (lpayment != null && lpayment.getOrders() == this) {
				lpayment.setOrders(null);
			}
		}
	}
	
	public Payment getPayment() {
		return payment;
	}
	
	public void getOrderEntries() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void updateShipment() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public void updatePayment() {
		//TODO: Implement Method
		throw new UnsupportedOperationException();
	}
	
	public String toString() {
		return String.valueOf(getID2());
	}
	
}

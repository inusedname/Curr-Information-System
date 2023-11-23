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
import org.orm.PersistentException;
public class OrdersProcessor {
	private int ID;
	
	private int shipFee;
	
	private String paymentDetail;
	
	private int cartFee;
	
	private String status;
	
	private int ID2;
	
	private String action="";
	
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
		return paymentDetail == null ? "" : paymentDetail;
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
		return status == null ? "" : status;
	}
	
	public void setID2(int value) {
		this.ID2 = value;
	}
	
	public int getID2() {
		return ID2;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int customer_customerID;
	
	public void setCustomer_customerID(int value) {
		this.customer_customerID = value;
	}
	
	public int getCustomer_customerID() {
		return customer_customerID;
	}
	
	private int shipment_shipmentID;
	
	public void setShipment_shipmentID(int value) {
		this.shipment_shipmentID = value;
	}
	
	public int getShipment_shipmentID() {
		return shipment_shipmentID;
	}
	
	private int payment_paymentID;
	
	public void setPayment_paymentID(int value) {
		this.payment_paymentID = value;
	}
	
	public int getPayment_paymentID() {
		return payment_paymentID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Orders _orders = OrdersDAO.loadOrdersByORMID(getID2());
				if (_orders!= null) {
					copyFromBean(_orders);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				Orders _orders = OrdersDAO.createOrders();
				copyToBean(_orders);
				if (OrdersDAO.save(_orders)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				Orders _orders= OrdersDAO.loadOrdersByORMID(getID2());
				if (_orders != null) {
					copyToBean(_orders);
					if (OrdersDAO.save(_orders)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				Orders _orders = OrdersDAO.loadOrdersByORMID(getID2());
				if (_orders != null && OrdersDAO.deleteAndDissociate(_orders)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(Orders _orders) {
		setID(_orders.getID());
		setShipFee(_orders.getShipFee());
		setPaymentDetail(_orders.getPaymentDetail());
		setCartFee(_orders.getCartFee());
		setStatus(_orders.getStatus());
		setID2(_orders.getORMID());
		
		{
			Customer _customer = _orders.getCustomer();
			if (_customer != null) {
				setCustomer_customerID(_customer.getORMID());
			}
		}
		
		
		{
			Shipment _shipment = _orders.getShipment();
			if (_shipment != null) {
				setShipment_shipmentID(_shipment.getORMID());
			}
		}
		
		
		{
			Payment _payment = _orders.getPayment();
			if (_payment != null) {
				setPayment_paymentID(_payment.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Orders _orders) {
		_orders.setID(getID());
		_orders.setShipFee(getShipFee());
		_orders.setPaymentDetail(getPaymentDetail());
		_orders.setCartFee(getCartFee());
		_orders.setStatus(getStatus());
		try  {
			Customer _customer = CustomerDAO.loadCustomerByORMID(getCustomer_customerID());
			_orders.setCustomer(_customer);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Shipment _shipment = ShipmentDAO.loadShipmentByORMID(getShipment_shipmentID());
			_orders.setShipment(_shipment);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Payment _payment = PaymentDAO.loadPaymentByORMID(getPayment_paymentID());
			_orders.setPayment(_payment);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


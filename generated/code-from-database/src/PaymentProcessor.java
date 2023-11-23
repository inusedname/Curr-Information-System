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
public class PaymentProcessor {
	private int ID;
	
	private int shipFee;
	
	private int productFee;
	
	private String status;
	
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
		return status == null ? "" : status;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int orders_ordersID2;
	
	public void setOrders_ordersID2(int value) {
		this.orders_ordersID2 = value;
	}
	
	public int getOrders_ordersID2() {
		return orders_ordersID2;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Payment _payment = PaymentDAO.loadPaymentByORMID(getID());
				if (_payment!= null) {
					copyFromBean(_payment);
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
				Payment _payment = PaymentDAO.createPayment();
				copyToBean(_payment);
				if (PaymentDAO.save(_payment)) {
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
				Payment _payment= PaymentDAO.loadPaymentByORMID(getID());
				if (_payment != null) {
					copyToBean(_payment);
					if (PaymentDAO.save(_payment)) {
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
				Payment _payment = PaymentDAO.loadPaymentByORMID(getID());
				if (_payment != null && PaymentDAO.deleteAndDissociate(_payment)) {
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
	
	private void copyFromBean(Payment _payment) {
		setShipFee(_payment.getShipFee());
		setProductFee(_payment.getProductFee());
		setStatus(_payment.getStatus());
		setID(_payment.getORMID());
		
		{
			Orders _orders = _payment.getOrders();
			if (_orders != null) {
				setOrders_ordersID2(_orders.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Payment _payment) {
		_payment.setShipFee(getShipFee());
		_payment.setProductFee(getProductFee());
		_payment.setStatus(getStatus());
		try  {
			Orders _orders = OrdersDAO.loadOrdersByORMID(getOrders_ordersID2());
			_payment.setOrders(_orders);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


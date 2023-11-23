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
public class PaymentCODProcessor {
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
				PaymentCOD _paymentCOD = PaymentCODDAO.loadPaymentCODByORMID(getID());
				if (_paymentCOD!= null) {
					copyFromBean(_paymentCOD);
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
				PaymentCOD _paymentCOD = PaymentCODDAO.createPaymentCOD();
				copyToBean(_paymentCOD);
				if (PaymentCODDAO.save(_paymentCOD)) {
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
				PaymentCOD _paymentCOD= PaymentCODDAO.loadPaymentCODByORMID(getID());
				if (_paymentCOD != null) {
					copyToBean(_paymentCOD);
					if (PaymentCODDAO.save(_paymentCOD)) {
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
				PaymentCOD _paymentCOD = PaymentCODDAO.loadPaymentCODByORMID(getID());
				if (_paymentCOD != null && PaymentCODDAO.delete(_paymentCOD)) {
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
	
	private void copyFromBean(PaymentCOD _paymentCOD) {
		setShipFee(_paymentCOD.getShipFee());
		setProductFee(_paymentCOD.getProductFee());
		setStatus(_paymentCOD.getStatus());
		setID(_paymentCOD.getORMID());
		
		{
			Orders _orders = _paymentCOD.getOrders();
			if (_orders != null) {
				setOrders_ordersID2(_orders.getORMID());
			}
		}
		
	}
	
	private void copyToBean(PaymentCOD _paymentCOD) {
		_paymentCOD.setShipFee(getShipFee());
		_paymentCOD.setProductFee(getProductFee());
		_paymentCOD.setStatus(getStatus());
		try  {
			Orders _orders = OrdersDAO.loadOrdersByORMID(getOrders_ordersID2());
			_paymentCOD.setOrders(_orders);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


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
public class PaymentByCardProcessor {
	private int ID;
	
	private int shipFee;
	
	private int productFee;
	
	private String status;
	
	private String cardNumber;
	
	private Integer bank;
	
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
	
	public void setCardNumber(String value) {
		this.cardNumber = value;
	}
	
	public String getCardNumber() {
		return cardNumber == null ? "" : cardNumber;
	}
	
	public void setBank(int value) {
		setBank(Integer.valueOf(value));
	}
	
	public void setBank(Integer value) {
		this.bank = value;
	}
	
	public Integer getBank() {
		return bank;
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
				PaymentByCard _paymentByCard = PaymentByCardDAO.loadPaymentByCardByORMID(getID());
				if (_paymentByCard!= null) {
					copyFromBean(_paymentByCard);
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
				PaymentByCard _paymentByCard = PaymentByCardDAO.createPaymentByCard();
				copyToBean(_paymentByCard);
				if (PaymentByCardDAO.save(_paymentByCard)) {
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
				PaymentByCard _paymentByCard= PaymentByCardDAO.loadPaymentByCardByORMID(getID());
				if (_paymentByCard != null) {
					copyToBean(_paymentByCard);
					if (PaymentByCardDAO.save(_paymentByCard)) {
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
				PaymentByCard _paymentByCard = PaymentByCardDAO.loadPaymentByCardByORMID(getID());
				if (_paymentByCard != null && PaymentByCardDAO.delete(_paymentByCard)) {
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
	
	private void copyFromBean(PaymentByCard _paymentByCard) {
		setShipFee(_paymentByCard.getShipFee());
		setProductFee(_paymentByCard.getProductFee());
		setStatus(_paymentByCard.getStatus());
		setCardNumber(_paymentByCard.getCardNumber());
		setBank(_paymentByCard.getBank());
		setID(_paymentByCard.getORMID());
		
		{
			Orders _orders = _paymentByCard.getOrders();
			if (_orders != null) {
				setOrders_ordersID2(_orders.getORMID());
			}
		}
		
	}
	
	private void copyToBean(PaymentByCard _paymentByCard) {
		_paymentByCard.setShipFee(getShipFee());
		_paymentByCard.setProductFee(getProductFee());
		_paymentByCard.setStatus(getStatus());
		_paymentByCard.setCardNumber(getCardNumber());
		_paymentByCard.setBank(getBank());
		try  {
			Orders _orders = OrdersDAO.loadOrdersByORMID(getOrders_ordersID2());
			_paymentByCard.setOrders(_orders);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


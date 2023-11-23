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
public class ShipmentProcessor {
	private int ID;
	
	private boolean isRabbit;
	
	private String status;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setIsRabbit(boolean value) {
		this.isRabbit = value;
	}
	
	public boolean getIsRabbit() {
		return isRabbit;
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
	
	private int order_ordersID2;
	
	public void setOrder_ordersID2(int value) {
		this.order_ordersID2 = value;
	}
	
	public int getOrder_ordersID2() {
		return order_ordersID2;
	}
	
	private int orderAddress_orderAddressID;
	
	public void setOrderAddress_orderAddressID(int value) {
		this.orderAddress_orderAddressID = value;
	}
	
	public int getOrderAddress_orderAddressID() {
		return orderAddress_orderAddressID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Shipment _shipment = ShipmentDAO.loadShipmentByORMID(getID());
				if (_shipment!= null) {
					copyFromBean(_shipment);
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
				Shipment _shipment = ShipmentDAO.createShipment();
				copyToBean(_shipment);
				if (ShipmentDAO.save(_shipment)) {
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
				Shipment _shipment= ShipmentDAO.loadShipmentByORMID(getID());
				if (_shipment != null) {
					copyToBean(_shipment);
					if (ShipmentDAO.save(_shipment)) {
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
				Shipment _shipment = ShipmentDAO.loadShipmentByORMID(getID());
				if (_shipment != null && ShipmentDAO.deleteAndDissociate(_shipment)) {
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
	
	private void copyFromBean(Shipment _shipment) {
		setIsRabbit(_shipment.getIsRabbit());
		setStatus(_shipment.getStatus());
		setID(_shipment.getORMID());
		
		{
			Orders _orders = _shipment.getOrder();
			if (_orders != null) {
				setOrder_ordersID2(_orders.getORMID());
			}
		}
		
		
		{
			OrderAddress _orderAddress = _shipment.getOrderAddress();
			if (_orderAddress != null) {
				setOrderAddress_orderAddressID(_orderAddress.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Shipment _shipment) {
		_shipment.setIsRabbit(getIsRabbit());
		_shipment.setStatus(getStatus());
		try  {
			Orders _order = OrdersDAO.loadOrdersByORMID(getOrder_ordersID2());
			_shipment.setOrder(_order);
		}
		catch (PersistentException e) {
		}
		
		try  {
			OrderAddress _orderAddress = OrderAddressDAO.loadOrderAddressByORMID(getOrderAddress_orderAddressID());
			_shipment.setOrderAddress(_orderAddress);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


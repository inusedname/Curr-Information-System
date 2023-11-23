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
public class OrderAddressProcessor {
	private int ID;
	
	private String city;
	
	private String detail;
	
	private String phone;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setCity(String value) {
		this.city = value;
	}
	
	public String getCity() {
		return city == null ? "" : city;
	}
	
	public void setDetail(String value) {
		this.detail = value;
	}
	
	public String getDetail() {
		return detail == null ? "" : detail;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return phone == null ? "" : phone;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int shipment_shipmentID;
	
	public void setShipment_shipmentID(int value) {
		this.shipment_shipmentID = value;
	}
	
	public int getShipment_shipmentID() {
		return shipment_shipmentID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				OrderAddress _orderAddress = OrderAddressDAO.loadOrderAddressByORMID(getID());
				if (_orderAddress!= null) {
					copyFromBean(_orderAddress);
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
				OrderAddress _orderAddress = OrderAddressDAO.createOrderAddress();
				copyToBean(_orderAddress);
				if (OrderAddressDAO.save(_orderAddress)) {
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
				OrderAddress _orderAddress= OrderAddressDAO.loadOrderAddressByORMID(getID());
				if (_orderAddress != null) {
					copyToBean(_orderAddress);
					if (OrderAddressDAO.save(_orderAddress)) {
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
				OrderAddress _orderAddress = OrderAddressDAO.loadOrderAddressByORMID(getID());
				if (_orderAddress != null && OrderAddressDAO.deleteAndDissociate(_orderAddress)) {
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
	
	private void copyFromBean(OrderAddress _orderAddress) {
		setCity(_orderAddress.getCity());
		setDetail(_orderAddress.getDetail());
		setPhone(_orderAddress.getPhone());
		setID(_orderAddress.getORMID());
		
		{
			Shipment _shipment = _orderAddress.getShipment();
			if (_shipment != null) {
				setShipment_shipmentID(_shipment.getORMID());
			}
		}
		
	}
	
	private void copyToBean(OrderAddress _orderAddress) {
		_orderAddress.setCity(getCity());
		_orderAddress.setDetail(getDetail());
		_orderAddress.setPhone(getPhone());
		try  {
			Shipment _shipment = ShipmentDAO.loadShipmentByORMID(getShipment_shipmentID());
			_orderAddress.setShipment(_shipment);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


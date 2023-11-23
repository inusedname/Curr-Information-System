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
public class AddressProcessor {
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
	
	private int customer_customerID;
	
	public void setCustomer_customerID(int value) {
		this.customer_customerID = value;
	}
	
	public int getCustomer_customerID() {
		return customer_customerID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Address _address = AddressDAO.loadAddressByORMID(getID());
				if (_address!= null) {
					copyFromBean(_address);
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
				Address _address = AddressDAO.createAddress();
				copyToBean(_address);
				if (AddressDAO.save(_address)) {
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
				Address _address= AddressDAO.loadAddressByORMID(getID());
				if (_address != null) {
					copyToBean(_address);
					if (AddressDAO.save(_address)) {
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
				Address _address = AddressDAO.loadAddressByORMID(getID());
				if (_address != null && AddressDAO.deleteAndDissociate(_address)) {
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
	
	private void copyFromBean(Address _address) {
		setCity(_address.getCity());
		setDetail(_address.getDetail());
		setPhone(_address.getPhone());
		setID(_address.getORMID());
		
		{
			Customer _customer = _address.getCustomer();
			if (_customer != null) {
				setCustomer_customerID(_customer.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Address _address) {
		_address.setCity(getCity());
		_address.setDetail(getDetail());
		_address.setPhone(getPhone());
		try  {
			Customer _customer = CustomerDAO.loadCustomerByORMID(getCustomer_customerID());
			_address.setCustomer(_customer);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


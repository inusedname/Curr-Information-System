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
public class CustomerProcessor {
	private int ID;
	
	private String email;
	
	private String username;
	
	private String password;
	
	private java.util.Date create;
	
	private String name;
	
	private String phone;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username == null ? "" : username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password == null ? "" : password;
	}
	
	public void setCreate(java.util.Date value) {
		this.create = value;
	}
	
	public java.util.Date getCreate() {
		return create;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name == null ? "" : name;
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
	
	private int cart_cartID;
	
	public void setCart_cartID(int value) {
		this.cart_cartID = value;
	}
	
	public int getCart_cartID() {
		return cart_cartID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Customer _customer = CustomerDAO.loadCustomerByORMID(getID());
				if (_customer!= null) {
					copyFromBean(_customer);
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
				Customer _customer = CustomerDAO.createCustomer();
				copyToBean(_customer);
				if (CustomerDAO.save(_customer)) {
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
				Customer _customer= CustomerDAO.loadCustomerByORMID(getID());
				if (_customer != null) {
					copyToBean(_customer);
					if (CustomerDAO.save(_customer)) {
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
				Customer _customer = CustomerDAO.loadCustomerByORMID(getID());
				if (_customer != null && CustomerDAO.deleteAndDissociate(_customer)) {
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
	
	private void copyFromBean(Customer _customer) {
		setEmail(_customer.getEmail());
		setUsername(_customer.getUsername());
		setPassword(_customer.getPassword());
		setCreate(_customer.getCreate());
		setName(_customer.getName());
		setPhone(_customer.getPhone());
		setID(_customer.getORMID());
		
		{
			Cart _cart = _customer.getCart();
			if (_cart != null) {
				setCart_cartID(_cart.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Customer _customer) {
		_customer.setEmail(getEmail());
		_customer.setUsername(getUsername());
		_customer.setPassword(getPassword());
		_customer.setCreate(getCreate());
		_customer.setName(getName());
		_customer.setPhone(getPhone());
		try  {
			Cart _cart = CartDAO.loadCartByORMID(getCart_cartID());
			_customer.setCart(_cart);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


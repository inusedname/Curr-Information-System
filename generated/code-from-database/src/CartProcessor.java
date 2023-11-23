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
public class CartProcessor {
	private int ID;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
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
				Cart _cart = CartDAO.loadCartByORMID(getID());
				if (_cart!= null) {
					copyFromBean(_cart);
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
				Cart _cart = CartDAO.createCart();
				copyToBean(_cart);
				if (CartDAO.save(_cart)) {
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
				Cart _cart= CartDAO.loadCartByORMID(getID());
				if (_cart != null) {
					copyToBean(_cart);
					if (CartDAO.save(_cart)) {
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
				Cart _cart = CartDAO.loadCartByORMID(getID());
				if (_cart != null && CartDAO.deleteAndDissociate(_cart)) {
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
	
	private void copyFromBean(Cart _cart) {
		setID(_cart.getORMID());
		
		{
			Customer _customer = _cart.getCustomer();
			if (_customer != null) {
				setCustomer_customerID(_customer.getORMID());
			}
		}
		
	}
	
	private void copyToBean(Cart _cart) {
		try  {
			Customer _customer = CustomerDAO.loadCustomerByORMID(getCustomer_customerID());
			_cart.setCustomer(_customer);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


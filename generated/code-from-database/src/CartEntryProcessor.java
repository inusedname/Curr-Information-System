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
public class CartEntryProcessor {
	private int quantity;
	
	private int ID;
	
	private String action="";
	
	public void setQuantity(int value) {
		this.quantity = value;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
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
	
	private int product_productID;
	
	public void setProduct_productID(int value) {
		this.product_productID = value;
	}
	
	public int getProduct_productID() {
		return product_productID;
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
				CartEntry _cartEntry = CartEntryDAO.loadCartEntryByORMID(getID());
				if (_cartEntry!= null) {
					copyFromBean(_cartEntry);
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
				CartEntry _cartEntry = CartEntryDAO.createCartEntry();
				copyToBean(_cartEntry);
				if (CartEntryDAO.save(_cartEntry)) {
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
				CartEntry _cartEntry= CartEntryDAO.loadCartEntryByORMID(getID());
				if (_cartEntry != null) {
					copyToBean(_cartEntry);
					if (CartEntryDAO.save(_cartEntry)) {
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
				CartEntry _cartEntry = CartEntryDAO.loadCartEntryByORMID(getID());
				if (_cartEntry != null && CartEntryDAO.deleteAndDissociate(_cartEntry)) {
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
	
	private void copyFromBean(CartEntry _cartEntry) {
		setQuantity(_cartEntry.getQuantity());
		setID(_cartEntry.getORMID());
		
		{
			Product _product = _cartEntry.getProduct();
			if (_product != null) {
				setProduct_productID(_product.getORMID());
			}
		}
		
		
		{
			Cart _cart = _cartEntry.getCart();
			if (_cart != null) {
				setCart_cartID(_cart.getORMID());
			}
		}
		
	}
	
	private void copyToBean(CartEntry _cartEntry) {
		_cartEntry.setQuantity(getQuantity());
		try  {
			Product _product = ProductDAO.loadProductByORMID(getProduct_productID());
			_cartEntry.setProduct(_product);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Cart _cart = CartDAO.loadCartByORMID(getCart_cartID());
			_cartEntry.setCart(_cart);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


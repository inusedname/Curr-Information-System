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
public class OrderEntryProcessor {
	private int quantity;
	
	private int ID2;
	
	private int ID;
	
	private String action="";
	
	public void setQuantity(int value) {
		this.quantity = value;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setID2(int value) {
		this.ID2 = value;
	}
	
	public int getID2() {
		return ID2;
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
	
	private int orders_ordersID2;
	
	public void setOrders_ordersID2(int value) {
		this.orders_ordersID2 = value;
	}
	
	public int getOrders_ordersID2() {
		return orders_ordersID2;
	}
	
	private int product_productID;
	
	public void setProduct_productID(int value) {
		this.product_productID = value;
	}
	
	public int getProduct_productID() {
		return product_productID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				OrderEntry _orderEntry = OrderEntryDAO.loadOrderEntryByORMID(getID2());
				if (_orderEntry!= null) {
					copyFromBean(_orderEntry);
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
				OrderEntry _orderEntry = OrderEntryDAO.createOrderEntry();
				copyToBean(_orderEntry);
				if (OrderEntryDAO.save(_orderEntry)) {
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
				OrderEntry _orderEntry= OrderEntryDAO.loadOrderEntryByORMID(getID2());
				if (_orderEntry != null) {
					copyToBean(_orderEntry);
					if (OrderEntryDAO.save(_orderEntry)) {
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
				OrderEntry _orderEntry = OrderEntryDAO.loadOrderEntryByORMID(getID2());
				if (_orderEntry != null && OrderEntryDAO.deleteAndDissociate(_orderEntry)) {
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
	
	private void copyFromBean(OrderEntry _orderEntry) {
		setQuantity(_orderEntry.getQuantity());
		setID(_orderEntry.getID());
		setID2(_orderEntry.getORMID());
		
		{
			Orders _orders = _orderEntry.getOrders();
			if (_orders != null) {
				setOrders_ordersID2(_orders.getORMID());
			}
		}
		
		
		{
			Product _product = _orderEntry.getProduct();
			if (_product != null) {
				setProduct_productID(_product.getORMID());
			}
		}
		
	}
	
	private void copyToBean(OrderEntry _orderEntry) {
		_orderEntry.setQuantity(getQuantity());
		_orderEntry.setID(getID());
		try  {
			Orders _orders = OrdersDAO.loadOrdersByORMID(getOrders_ordersID2());
			_orderEntry.setOrders(_orders);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Product _product = ProductDAO.loadProductByORMID(getProduct_productID());
			_orderEntry.setProduct(_product);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


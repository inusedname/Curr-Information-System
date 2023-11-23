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
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CustomerDAO {
	public static Customer loadCustomerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadCustomerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer getCustomerByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getCustomerByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadCustomerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer getCustomerByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getCustomerByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Customer) session.load(Customer.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer getCustomerByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Customer) session.get(Customer.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Customer) session.load(Customer.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer getCustomerByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Customer) session.get(Customer.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryCustomer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryCustomer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer[] listCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer[] listCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Customer as Customer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCustomer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Customer as Customer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Customer", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer[] listCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCustomer(session, condition, orderBy);
			return (Customer[]) list.toArray(new Customer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer[] listCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCustomer(session, condition, orderBy, lockMode);
			return (Customer[]) list.toArray(new Customer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer loadCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Customer[] customers = listCustomerByQuery(session, condition, orderBy);
		if (customers != null && customers.length > 0)
			return customers[0];
		else
			return null;
	}
	
	public static Customer loadCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Customer[] customers = listCustomerByQuery(session, condition, orderBy, lockMode);
		if (customers != null && customers.length > 0)
			return customers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCustomerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateCustomerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCustomerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateCustomerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCustomerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Customer as Customer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCustomerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Customer as Customer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Customer", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Customer createCustomer() {
		return new Customer();
	}
	
	public static boolean save(Customer customer) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().saveObject(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Customer customer) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().deleteObject(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Customer customer)throws PersistentException {
		try {
			if (customer.getCart() != null) {
				customer.getCart().setCustomer(null);
			}
			
			Orders[] lOrders = customer.order.toArray();
			for(int i = 0; i < lOrders.length; i++) {
				lOrders[i].setCustomer(null);
			}
			Address[] lAddresss = customer.address.toArray();
			for(int i = 0; i < lAddresss.length; i++) {
				lAddresss[i].setCustomer(null);
			}
			return delete(customer);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Customer customer, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (customer.getCart() != null) {
				customer.getCart().setCustomer(null);
			}
			
			Orders[] lOrders = customer.order.toArray();
			for(int i = 0; i < lOrders.length; i++) {
				lOrders[i].setCustomer(null);
			}
			Address[] lAddresss = customer.address.toArray();
			for(int i = 0; i < lAddresss.length; i++) {
				lAddresss[i].setCustomer(null);
			}
			try {
				session.delete(customer);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Customer customer) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().refresh(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Customer customer) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().evict(customer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

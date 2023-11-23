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

public class OrdersDAO {
	public static Orders loadOrdersByORMID(int ID2) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadOrdersByORMID(session, ID2);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders getOrdersByORMID(int ID2) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getOrdersByORMID(session, ID2);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders loadOrdersByORMID(int ID2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadOrdersByORMID(session, ID2, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders getOrdersByORMID(int ID2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getOrdersByORMID(session, ID2, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders loadOrdersByORMID(PersistentSession session, int ID2) throws PersistentException {
		try {
			return (Orders) session.load(Orders.class, Integer.valueOf(ID2));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders getOrdersByORMID(PersistentSession session, int ID2) throws PersistentException {
		try {
			return (Orders) session.get(Orders.class, Integer.valueOf(ID2));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders loadOrdersByORMID(PersistentSession session, int ID2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Orders) session.load(Orders.class, Integer.valueOf(ID2), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders getOrdersByORMID(PersistentSession session, int ID2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Orders) session.get(Orders.class, Integer.valueOf(ID2), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrders(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryOrders(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrders(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryOrders(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders[] listOrdersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listOrdersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders[] listOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listOrdersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrders(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Orders as Orders");
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
	
	public static List queryOrders(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Orders as Orders");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Orders", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders[] listOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOrders(session, condition, orderBy);
			return (Orders[]) list.toArray(new Orders[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders[] listOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOrders(session, condition, orderBy, lockMode);
			return (Orders[]) list.toArray(new Orders[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders loadOrdersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadOrdersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders loadOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadOrdersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders loadOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Orders[] orderses = listOrdersByQuery(session, condition, orderBy);
		if (orderses != null && orderses.length > 0)
			return orderses[0];
		else
			return null;
	}
	
	public static Orders loadOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Orders[] orderses = listOrdersByQuery(session, condition, orderBy, lockMode);
		if (orderses != null && orderses.length > 0)
			return orderses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOrdersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateOrdersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrdersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateOrdersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrdersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Orders as Orders");
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
	
	public static java.util.Iterator iterateOrdersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Orders as Orders");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Orders", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Orders createOrders() {
		return new Orders();
	}
	
	public static boolean save(Orders orders) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().saveObject(orders);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Orders orders) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().deleteObject(orders);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Orders orders)throws PersistentException {
		try {
			if (orders.getCustomer() != null) {
				orders.getCustomer().order.remove(orders);
			}
			
			if (orders.getShipment() != null) {
				orders.getShipment().setOrder(null);
			}
			
			OrderEntry[] lOrderEntryss = orders.orderEntrys.toArray();
			for(int i = 0; i < lOrderEntryss.length; i++) {
				lOrderEntryss[i].setOrders(null);
			}
			if (orders.getPayment() != null) {
				orders.getPayment().setOrders(null);
			}
			
			return delete(orders);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Orders orders, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (orders.getCustomer() != null) {
				orders.getCustomer().order.remove(orders);
			}
			
			if (orders.getShipment() != null) {
				orders.getShipment().setOrder(null);
			}
			
			OrderEntry[] lOrderEntryss = orders.orderEntrys.toArray();
			for(int i = 0; i < lOrderEntryss.length; i++) {
				lOrderEntryss[i].setOrders(null);
			}
			if (orders.getPayment() != null) {
				orders.getPayment().setOrders(null);
			}
			
			try {
				session.delete(orders);
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
	
	public static boolean refresh(Orders orders) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().refresh(orders);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Orders orders) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().evict(orders);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

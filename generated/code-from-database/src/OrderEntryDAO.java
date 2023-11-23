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

public class OrderEntryDAO {
	public static OrderEntry loadOrderEntryByORMID(int ID2) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadOrderEntryByORMID(session, ID2);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry getOrderEntryByORMID(int ID2) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getOrderEntryByORMID(session, ID2);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry loadOrderEntryByORMID(int ID2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadOrderEntryByORMID(session, ID2, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry getOrderEntryByORMID(int ID2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getOrderEntryByORMID(session, ID2, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry loadOrderEntryByORMID(PersistentSession session, int ID2) throws PersistentException {
		try {
			return (OrderEntry) session.load(OrderEntry.class, Integer.valueOf(ID2));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry getOrderEntryByORMID(PersistentSession session, int ID2) throws PersistentException {
		try {
			return (OrderEntry) session.get(OrderEntry.class, Integer.valueOf(ID2));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry loadOrderEntryByORMID(PersistentSession session, int ID2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrderEntry) session.load(OrderEntry.class, Integer.valueOf(ID2), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry getOrderEntryByORMID(PersistentSession session, int ID2, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrderEntry) session.get(OrderEntry.class, Integer.valueOf(ID2), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrderEntry(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryOrderEntry(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrderEntry(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryOrderEntry(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry[] listOrderEntryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listOrderEntryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry[] listOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listOrderEntryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryOrderEntry(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderEntry as OrderEntry");
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
	
	public static List queryOrderEntry(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderEntry as OrderEntry");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("OrderEntry", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry[] listOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryOrderEntry(session, condition, orderBy);
			return (OrderEntry[]) list.toArray(new OrderEntry[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry[] listOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryOrderEntry(session, condition, orderBy, lockMode);
			return (OrderEntry[]) list.toArray(new OrderEntry[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry loadOrderEntryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadOrderEntryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry loadOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadOrderEntryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry loadOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		OrderEntry[] orderEntrys = listOrderEntryByQuery(session, condition, orderBy);
		if (orderEntrys != null && orderEntrys.length > 0)
			return orderEntrys[0];
		else
			return null;
	}
	
	public static OrderEntry loadOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		OrderEntry[] orderEntrys = listOrderEntryByQuery(session, condition, orderBy, lockMode);
		if (orderEntrys != null && orderEntrys.length > 0)
			return orderEntrys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOrderEntryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateOrderEntryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrderEntryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateOrderEntryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrderEntryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderEntry as OrderEntry");
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
	
	public static java.util.Iterator iterateOrderEntryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From OrderEntry as OrderEntry");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("OrderEntry", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static OrderEntry createOrderEntry() {
		return new OrderEntry();
	}
	
	public static boolean save(OrderEntry orderEntry) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().saveObject(orderEntry);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(OrderEntry orderEntry) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().deleteObject(orderEntry);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(OrderEntry orderEntry)throws PersistentException {
		try {
			if (orderEntry.getProduct() != null) {
				orderEntry.getProduct().orderEntrys.remove(orderEntry);
			}
			
			if (orderEntry.getOrders() != null) {
				orderEntry.getOrders().orderEntrys.remove(orderEntry);
			}
			
			return delete(orderEntry);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(OrderEntry orderEntry, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (orderEntry.getProduct() != null) {
				orderEntry.getProduct().orderEntrys.remove(orderEntry);
			}
			
			if (orderEntry.getOrders() != null) {
				orderEntry.getOrders().orderEntrys.remove(orderEntry);
			}
			
			try {
				session.delete(orderEntry);
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
	
	public static boolean refresh(OrderEntry orderEntry) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().refresh(orderEntry);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(OrderEntry orderEntry) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().evict(orderEntry);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

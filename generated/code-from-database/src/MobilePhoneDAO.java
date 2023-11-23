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

public class MobilePhoneDAO {
	public static MobilePhone loadMobilePhoneByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadMobilePhoneByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone getMobilePhoneByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getMobilePhoneByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone loadMobilePhoneByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadMobilePhoneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone getMobilePhoneByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getMobilePhoneByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone loadMobilePhoneByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (MobilePhone) session.load(MobilePhone.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone getMobilePhoneByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (MobilePhone) session.get(MobilePhone.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone loadMobilePhoneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MobilePhone) session.load(MobilePhone.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone getMobilePhoneByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MobilePhone) session.get(MobilePhone.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMobilePhone(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryMobilePhone(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMobilePhone(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryMobilePhone(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone[] listMobilePhoneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listMobilePhoneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone[] listMobilePhoneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listMobilePhoneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMobilePhone(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MobilePhone as MobilePhone");
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
	
	public static List queryMobilePhone(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MobilePhone as MobilePhone");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MobilePhone", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone[] listMobilePhoneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMobilePhone(session, condition, orderBy);
			return (MobilePhone[]) list.toArray(new MobilePhone[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone[] listMobilePhoneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMobilePhone(session, condition, orderBy, lockMode);
			return (MobilePhone[]) list.toArray(new MobilePhone[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone loadMobilePhoneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadMobilePhoneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone loadMobilePhoneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadMobilePhoneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone loadMobilePhoneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MobilePhone[] mobilePhones = listMobilePhoneByQuery(session, condition, orderBy);
		if (mobilePhones != null && mobilePhones.length > 0)
			return mobilePhones[0];
		else
			return null;
	}
	
	public static MobilePhone loadMobilePhoneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MobilePhone[] mobilePhones = listMobilePhoneByQuery(session, condition, orderBy, lockMode);
		if (mobilePhones != null && mobilePhones.length > 0)
			return mobilePhones[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMobilePhoneByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateMobilePhoneByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMobilePhoneByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateMobilePhoneByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMobilePhoneByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MobilePhone as MobilePhone");
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
	
	public static java.util.Iterator iterateMobilePhoneByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MobilePhone as MobilePhone");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MobilePhone", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhone createMobilePhone() {
		return new MobilePhone();
	}
	
	public static boolean save(MobilePhone mobilePhone) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().saveObject(mobilePhone);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(MobilePhone mobilePhone) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().deleteObject(mobilePhone);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(MobilePhone mobilePhone)throws PersistentException {
		try {
			if (mobilePhone.getBrand() != null) {
				mobilePhone.getBrand().setPhone(null);
			}
			
			OrderEntry[] lOrderEntryss = mobilePhone.orderEntrys.toArray();
			for(int i = 0; i < lOrderEntryss.length; i++) {
				lOrderEntryss[i].setProduct(null);
			}
			CartEntry[] lCartEntryss = mobilePhone.cartEntrys.toArray();
			for(int i = 0; i < lCartEntryss.length; i++) {
				lCartEntryss[i].setProduct(null);
			}
			return delete(mobilePhone);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(MobilePhone mobilePhone, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (mobilePhone.getBrand() != null) {
				mobilePhone.getBrand().setPhone(null);
			}
			
			OrderEntry[] lOrderEntryss = mobilePhone.orderEntrys.toArray();
			for(int i = 0; i < lOrderEntryss.length; i++) {
				lOrderEntryss[i].setProduct(null);
			}
			CartEntry[] lCartEntryss = mobilePhone.cartEntrys.toArray();
			for(int i = 0; i < lCartEntryss.length; i++) {
				lCartEntryss[i].setProduct(null);
			}
			try {
				session.delete(mobilePhone);
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
	
	public static boolean refresh(MobilePhone mobilePhone) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().refresh(mobilePhone);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(MobilePhone mobilePhone) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().evict(mobilePhone);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

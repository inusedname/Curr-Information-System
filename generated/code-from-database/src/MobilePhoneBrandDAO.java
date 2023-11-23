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

public class MobilePhoneBrandDAO {
	public static MobilePhoneBrand loadMobilePhoneBrandByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadMobilePhoneBrandByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand getMobilePhoneBrandByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getMobilePhoneBrandByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand loadMobilePhoneBrandByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadMobilePhoneBrandByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand getMobilePhoneBrandByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getMobilePhoneBrandByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand loadMobilePhoneBrandByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (MobilePhoneBrand) session.load(MobilePhoneBrand.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand getMobilePhoneBrandByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (MobilePhoneBrand) session.get(MobilePhoneBrand.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand loadMobilePhoneBrandByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MobilePhoneBrand) session.load(MobilePhoneBrand.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand getMobilePhoneBrandByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (MobilePhoneBrand) session.get(MobilePhoneBrand.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMobilePhoneBrand(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryMobilePhoneBrand(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMobilePhoneBrand(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryMobilePhoneBrand(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand[] listMobilePhoneBrandByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listMobilePhoneBrandByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand[] listMobilePhoneBrandByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listMobilePhoneBrandByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryMobilePhoneBrand(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MobilePhoneBrand as MobilePhoneBrand");
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
	
	public static List queryMobilePhoneBrand(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MobilePhoneBrand as MobilePhoneBrand");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MobilePhoneBrand", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand[] listMobilePhoneBrandByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryMobilePhoneBrand(session, condition, orderBy);
			return (MobilePhoneBrand[]) list.toArray(new MobilePhoneBrand[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand[] listMobilePhoneBrandByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryMobilePhoneBrand(session, condition, orderBy, lockMode);
			return (MobilePhoneBrand[]) list.toArray(new MobilePhoneBrand[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand loadMobilePhoneBrandByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadMobilePhoneBrandByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand loadMobilePhoneBrandByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadMobilePhoneBrandByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand loadMobilePhoneBrandByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		MobilePhoneBrand[] mobilePhoneBrands = listMobilePhoneBrandByQuery(session, condition, orderBy);
		if (mobilePhoneBrands != null && mobilePhoneBrands.length > 0)
			return mobilePhoneBrands[0];
		else
			return null;
	}
	
	public static MobilePhoneBrand loadMobilePhoneBrandByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		MobilePhoneBrand[] mobilePhoneBrands = listMobilePhoneBrandByQuery(session, condition, orderBy, lockMode);
		if (mobilePhoneBrands != null && mobilePhoneBrands.length > 0)
			return mobilePhoneBrands[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateMobilePhoneBrandByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateMobilePhoneBrandByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMobilePhoneBrandByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateMobilePhoneBrandByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateMobilePhoneBrandByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MobilePhoneBrand as MobilePhoneBrand");
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
	
	public static java.util.Iterator iterateMobilePhoneBrandByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From MobilePhoneBrand as MobilePhoneBrand");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("MobilePhoneBrand", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static MobilePhoneBrand createMobilePhoneBrand() {
		return new MobilePhoneBrand();
	}
	
	public static boolean save(MobilePhoneBrand mobilePhoneBrand) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().saveObject(mobilePhoneBrand);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(MobilePhoneBrand mobilePhoneBrand) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().deleteObject(mobilePhoneBrand);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(MobilePhoneBrand mobilePhoneBrand)throws PersistentException {
		try {
			if (mobilePhoneBrand.getPhone() != null) {
				mobilePhoneBrand.getPhone().setBrand(null);
			}
			
			return delete(mobilePhoneBrand);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(MobilePhoneBrand mobilePhoneBrand, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (mobilePhoneBrand.getPhone() != null) {
				mobilePhoneBrand.getPhone().setBrand(null);
			}
			
			try {
				session.delete(mobilePhoneBrand);
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
	
	public static boolean refresh(MobilePhoneBrand mobilePhoneBrand) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().refresh(mobilePhoneBrand);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(MobilePhoneBrand mobilePhoneBrand) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().evict(mobilePhoneBrand);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

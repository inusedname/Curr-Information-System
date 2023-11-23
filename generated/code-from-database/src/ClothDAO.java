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

public class ClothDAO {
	public static Cloth loadClothByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadClothByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth getClothByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getClothByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth loadClothByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadClothByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth getClothByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getClothByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth loadClothByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cloth) session.load(Cloth.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth getClothByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cloth) session.get(Cloth.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth loadClothByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cloth) session.load(Cloth.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth getClothByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cloth) session.get(Cloth.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCloth(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryCloth(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCloth(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryCloth(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth[] listClothByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listClothByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth[] listClothByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listClothByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCloth(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cloth as Cloth");
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
	
	public static List queryCloth(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cloth as Cloth");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cloth", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth[] listClothByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCloth(session, condition, orderBy);
			return (Cloth[]) list.toArray(new Cloth[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth[] listClothByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCloth(session, condition, orderBy, lockMode);
			return (Cloth[]) list.toArray(new Cloth[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth loadClothByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadClothByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth loadClothByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadClothByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth loadClothByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Cloth[] cloths = listClothByQuery(session, condition, orderBy);
		if (cloths != null && cloths.length > 0)
			return cloths[0];
		else
			return null;
	}
	
	public static Cloth loadClothByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Cloth[] cloths = listClothByQuery(session, condition, orderBy, lockMode);
		if (cloths != null && cloths.length > 0)
			return cloths[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClothByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateClothByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClothByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateClothByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClothByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cloth as Cloth");
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
	
	public static java.util.Iterator iterateClothByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Cloth as Cloth");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Cloth", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Cloth createCloth() {
		return new Cloth();
	}
	
	public static boolean save(Cloth cloth) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().saveObject(cloth);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Cloth cloth) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().deleteObject(cloth);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Cloth cloth)throws PersistentException {
		try {
			if (cloth.getCategory() != null) {
				cloth.getCategory().cloth.remove(cloth);
			}
			
			if (cloth.getBrand() != null) {
				cloth.getBrand().setCloth(null);
			}
			
			OrderEntry[] lOrderEntryss = cloth.orderEntrys.toArray();
			for(int i = 0; i < lOrderEntryss.length; i++) {
				lOrderEntryss[i].setProduct(null);
			}
			CartEntry[] lCartEntryss = cloth.cartEntrys.toArray();
			for(int i = 0; i < lCartEntryss.length; i++) {
				lCartEntryss[i].setProduct(null);
			}
			return delete(cloth);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Cloth cloth, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (cloth.getCategory() != null) {
				cloth.getCategory().cloth.remove(cloth);
			}
			
			if (cloth.getBrand() != null) {
				cloth.getBrand().setCloth(null);
			}
			
			OrderEntry[] lOrderEntryss = cloth.orderEntrys.toArray();
			for(int i = 0; i < lOrderEntryss.length; i++) {
				lOrderEntryss[i].setProduct(null);
			}
			CartEntry[] lCartEntryss = cloth.cartEntrys.toArray();
			for(int i = 0; i < lCartEntryss.length; i++) {
				lCartEntryss[i].setProduct(null);
			}
			try {
				session.delete(cloth);
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
	
	public static boolean refresh(Cloth cloth) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().refresh(cloth);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Cloth cloth) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().evict(cloth);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

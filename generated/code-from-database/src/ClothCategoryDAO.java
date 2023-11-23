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

public class ClothCategoryDAO {
	public static ClothCategory loadClothCategoryByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadClothCategoryByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory getClothCategoryByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getClothCategoryByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory loadClothCategoryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadClothCategoryByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory getClothCategoryByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return getClothCategoryByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory loadClothCategoryByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ClothCategory) session.load(ClothCategory.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory getClothCategoryByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (ClothCategory) session.get(ClothCategory.class, Integer.valueOf(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory loadClothCategoryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ClothCategory) session.load(ClothCategory.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory getClothCategoryByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (ClothCategory) session.get(ClothCategory.class, Integer.valueOf(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClothCategory(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryClothCategory(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClothCategory(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return queryClothCategory(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory[] listClothCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listClothCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory[] listClothCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return listClothCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClothCategory(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ClothCategory as ClothCategory");
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
	
	public static List queryClothCategory(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ClothCategory as ClothCategory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ClothCategory", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory[] listClothCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryClothCategory(session, condition, orderBy);
			return (ClothCategory[]) list.toArray(new ClothCategory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory[] listClothCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryClothCategory(session, condition, orderBy, lockMode);
			return (ClothCategory[]) list.toArray(new ClothCategory[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory loadClothCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadClothCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory loadClothCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return loadClothCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory loadClothCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		ClothCategory[] clothCategorys = listClothCategoryByQuery(session, condition, orderBy);
		if (clothCategorys != null && clothCategorys.length > 0)
			return clothCategorys[0];
		else
			return null;
	}
	
	public static ClothCategory loadClothCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		ClothCategory[] clothCategorys = listClothCategoryByQuery(session, condition, orderBy, lockMode);
		if (clothCategorys != null && clothCategorys.length > 0)
			return clothCategorys[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClothCategoryByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateClothCategoryByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClothCategoryByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EcommerceevaPersistentManager.instance().getSession();
			return iterateClothCategoryByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClothCategoryByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ClothCategory as ClothCategory");
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
	
	public static java.util.Iterator iterateClothCategoryByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From ClothCategory as ClothCategory");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("ClothCategory", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static ClothCategory createClothCategory() {
		return new ClothCategory();
	}
	
	public static boolean save(ClothCategory clothCategory) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().saveObject(clothCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(ClothCategory clothCategory) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().deleteObject(clothCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ClothCategory clothCategory)throws PersistentException {
		try {
			Cloth[] lCloths = clothCategory.cloth.toArray();
			for(int i = 0; i < lCloths.length; i++) {
				lCloths[i].setCategory(null);
			}
			return delete(clothCategory);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(ClothCategory clothCategory, org.orm.PersistentSession session)throws PersistentException {
		try {
			Cloth[] lCloths = clothCategory.cloth.toArray();
			for(int i = 0; i < lCloths.length; i++) {
				lCloths[i].setCategory(null);
			}
			try {
				session.delete(clothCategory);
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
	
	public static boolean refresh(ClothCategory clothCategory) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().refresh(clothCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(ClothCategory clothCategory) throws PersistentException {
		try {
			EcommerceevaPersistentManager.instance().getSession().evict(clothCategory);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

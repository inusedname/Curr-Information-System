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
public class MobilePhoneBrandProcessor {
	private int ID;
	
	private String name;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name == null ? "" : name;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int phone_mobilePhoneID;
	
	public void setPhone_mobilePhoneID(int value) {
		this.phone_mobilePhoneID = value;
	}
	
	public int getPhone_mobilePhoneID() {
		return phone_mobilePhoneID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				MobilePhoneBrand _mobilePhoneBrand = MobilePhoneBrandDAO.loadMobilePhoneBrandByORMID(getID());
				if (_mobilePhoneBrand!= null) {
					copyFromBean(_mobilePhoneBrand);
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
				MobilePhoneBrand _mobilePhoneBrand = MobilePhoneBrandDAO.createMobilePhoneBrand();
				copyToBean(_mobilePhoneBrand);
				if (MobilePhoneBrandDAO.save(_mobilePhoneBrand)) {
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
				MobilePhoneBrand _mobilePhoneBrand= MobilePhoneBrandDAO.loadMobilePhoneBrandByORMID(getID());
				if (_mobilePhoneBrand != null) {
					copyToBean(_mobilePhoneBrand);
					if (MobilePhoneBrandDAO.save(_mobilePhoneBrand)) {
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
				MobilePhoneBrand _mobilePhoneBrand = MobilePhoneBrandDAO.loadMobilePhoneBrandByORMID(getID());
				if (_mobilePhoneBrand != null && MobilePhoneBrandDAO.deleteAndDissociate(_mobilePhoneBrand)) {
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
	
	private void copyFromBean(MobilePhoneBrand _mobilePhoneBrand) {
		setName(_mobilePhoneBrand.getName());
		setID(_mobilePhoneBrand.getORMID());
		
		{
			MobilePhone _mobilePhone = _mobilePhoneBrand.getPhone();
			if (_mobilePhone != null) {
				setPhone_mobilePhoneID(_mobilePhone.getORMID());
			}
		}
		
	}
	
	private void copyToBean(MobilePhoneBrand _mobilePhoneBrand) {
		_mobilePhoneBrand.setName(getName());
		try  {
			MobilePhone _phone = MobilePhoneDAO.loadMobilePhoneByORMID(getPhone_mobilePhoneID());
			_mobilePhoneBrand.setPhone(_phone);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


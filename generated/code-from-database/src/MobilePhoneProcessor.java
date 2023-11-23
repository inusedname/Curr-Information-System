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
public class MobilePhoneProcessor {
	private int ID;
	
	private Integer price;
	
	private String hardwareSpecs;
	
	private String ram;
	
	private String cpu;
	
	private String memory;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setPrice(int value) {
		setPrice(Integer.valueOf(value));
	}
	
	public void setPrice(Integer value) {
		this.price = value;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setHardwareSpecs(String value) {
		this.hardwareSpecs = value;
	}
	
	public String getHardwareSpecs() {
		return hardwareSpecs == null ? "" : hardwareSpecs;
	}
	
	public void setRam(String value) {
		this.ram = value;
	}
	
	public String getRam() {
		return ram == null ? "" : ram;
	}
	
	public void setCpu(String value) {
		this.cpu = value;
	}
	
	public String getCpu() {
		return cpu == null ? "" : cpu;
	}
	
	public void setMemory(String value) {
		this.memory = value;
	}
	
	public String getMemory() {
		return memory == null ? "" : memory;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int brand_mobilePhoneBrandID;
	
	public void setBrand_mobilePhoneBrandID(int value) {
		this.brand_mobilePhoneBrandID = value;
	}
	
	public int getBrand_mobilePhoneBrandID() {
		return brand_mobilePhoneBrandID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				MobilePhone _mobilePhone = MobilePhoneDAO.loadMobilePhoneByORMID(getID());
				if (_mobilePhone!= null) {
					copyFromBean(_mobilePhone);
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
				MobilePhone _mobilePhone = MobilePhoneDAO.createMobilePhone();
				copyToBean(_mobilePhone);
				if (MobilePhoneDAO.save(_mobilePhone)) {
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
				MobilePhone _mobilePhone= MobilePhoneDAO.loadMobilePhoneByORMID(getID());
				if (_mobilePhone != null) {
					copyToBean(_mobilePhone);
					if (MobilePhoneDAO.save(_mobilePhone)) {
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
				MobilePhone _mobilePhone = MobilePhoneDAO.loadMobilePhoneByORMID(getID());
				if (_mobilePhone != null && MobilePhoneDAO.deleteAndDissociate(_mobilePhone)) {
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
	
	private void copyFromBean(MobilePhone _mobilePhone) {
		setPrice(_mobilePhone.getPrice());
		setHardwareSpecs(_mobilePhone.getHardwareSpecs());
		setRam(_mobilePhone.getRam());
		setCpu(_mobilePhone.getCpu());
		setMemory(_mobilePhone.getMemory());
		setID(_mobilePhone.getORMID());
		
		{
			MobilePhoneBrand _mobilePhoneBrand = _mobilePhone.getBrand();
			if (_mobilePhoneBrand != null) {
				setBrand_mobilePhoneBrandID(_mobilePhoneBrand.getORMID());
			}
		}
		
	}
	
	private void copyToBean(MobilePhone _mobilePhone) {
		_mobilePhone.setPrice(getPrice());
		_mobilePhone.setHardwareSpecs(getHardwareSpecs());
		_mobilePhone.setRam(getRam());
		_mobilePhone.setCpu(getCpu());
		_mobilePhone.setMemory(getMemory());
		try  {
			MobilePhoneBrand _brand = MobilePhoneBrandDAO.loadMobilePhoneBrandByORMID(getBrand_mobilePhoneBrandID());
			_mobilePhone.setBrand(_brand);
		}
		catch (PersistentException e) {
		}
		
	}
	
}


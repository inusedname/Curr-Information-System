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
public class AdminProcessor {
	private int ID;
	
	private String email;
	
	private String username;
	
	private String password;
	
	private java.util.Date create;
	
	private java.util.Date lastLogin;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setUsername(String value) {
		this.username = value;
	}
	
	public String getUsername() {
		return username == null ? "" : username;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password == null ? "" : password;
	}
	
	public void setCreate(java.util.Date value) {
		this.create = value;
	}
	
	public java.util.Date getCreate() {
		return create;
	}
	
	public void setLastLogin(java.util.Date value) {
		this.lastLogin = value;
	}
	
	public java.util.Date getLastLogin() {
		return lastLogin;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Admin _admin = AdminDAO.loadAdminByORMID(getID());
				if (_admin!= null) {
					copyFromBean(_admin);
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
				Admin _admin = AdminDAO.createAdmin();
				copyToBean(_admin);
				if (AdminDAO.save(_admin)) {
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
				Admin _admin= AdminDAO.loadAdminByORMID(getID());
				if (_admin != null) {
					copyToBean(_admin);
					if (AdminDAO.save(_admin)) {
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
				Admin _admin = AdminDAO.loadAdminByORMID(getID());
				if (_admin != null && AdminDAO.delete(_admin)) {
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
	
	private void copyFromBean(Admin _admin) {
		setEmail(_admin.getEmail());
		setUsername(_admin.getUsername());
		setPassword(_admin.getPassword());
		setCreate(_admin.getCreate());
		setLastLogin(_admin.getLastLogin());
		setID(_admin.getORMID());
	}
	
	private void copyToBean(Admin _admin) {
		_admin.setEmail(getEmail());
		_admin.setUsername(getUsername());
		_admin.setPassword(getPassword());
		_admin.setCreate(getCreate());
		_admin.setLastLogin(getLastLogin());
	}
	
}


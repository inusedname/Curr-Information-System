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
public class AccountProcessor {
	private int ID;
	
	private String email;
	
	private String username;
	
	private String password;
	
	private java.util.Date create;
	
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
				Account _account = AccountDAO.loadAccountByORMID(getID());
				if (_account!= null) {
					copyFromBean(_account);
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
				Account _account = AccountDAO.createAccount();
				copyToBean(_account);
				if (AccountDAO.save(_account)) {
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
				Account _account= AccountDAO.loadAccountByORMID(getID());
				if (_account != null) {
					copyToBean(_account);
					if (AccountDAO.save(_account)) {
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
				Account _account = AccountDAO.loadAccountByORMID(getID());
				if (_account != null && AccountDAO.delete(_account)) {
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
	
	private void copyFromBean(Account _account) {
		setEmail(_account.getEmail());
		setUsername(_account.getUsername());
		setPassword(_account.getPassword());
		setCreate(_account.getCreate());
		setID(_account.getORMID());
	}
	
	private void copyToBean(Account _account) {
		_account.setEmail(getEmail());
		_account.setUsername(getUsername());
		_account.setPassword(getPassword());
		_account.setCreate(getCreate());
	}
	
}

